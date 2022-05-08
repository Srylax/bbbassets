package dev.srylax.bbbassets.input.provider;

import dev.srylax.bbbassets.input.message.MessageSpec;
import dev.srylax.bbbassets.input.validation.ValidationException;
import dev.srylax.bbbassets.input.validation.Validator;

import java.util.function.Function;

public abstract class BaseInputProvider<M extends MessageSpec,T> implements InputProvider<M,T> {
    abstract protected T getInput(M messageSpec, String errorMessage);

    @Override
    public <R> R input(M messageSpec, Function<T,R> transformer, Validator<Object, ?>... validator) {
        T input = getInput(messageSpec, null);

        String errorMessage;
        while ((errorMessage = evaluateErrorMessage(input, validator)) != null) {
            input = getInput(messageSpec, errorMessage);
        }
        return transformer.apply(input);
    }

    protected String evaluateErrorMessage(Object input, Validator<Object, ?>... validator) {
        try {
            for (Validator<Object, ?> v : validator) {
                v.validate(input);
            }
        } catch (ValidationException e) {
            return e.getMessage();
        }
        return null;
    }
}
