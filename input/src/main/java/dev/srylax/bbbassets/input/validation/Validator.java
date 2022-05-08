package dev.srylax.bbbassets.input.validation;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public abstract class Validator<T, R> {
    protected final List<Validator<R, ?>> andChain = new ArrayList<>();

    abstract protected R execValidate(T input) throws ValidationException;

    public R validate(T input) throws ValidationException {
        R result = execValidate(input);
        validateChain(result);
        return result;
    }

    public Validator<T, R> and(Validator<R, ?> other) {
        andChain.add(other);
        return this;
    }

    protected void validateChain(R input) throws ValidationException {
        for (Validator<R, ?> validator : andChain) {
            validator.validate(input);
        }
    }

}
