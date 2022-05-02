package dev.srylax.bbbassets.input.validation;

public abstract class ValidationMiddleware<T, R> {
    private ValidationMiddleware<R, ?> next;

    abstract R validate(T input) throws ValidationException;

    Object validateNext(R input) throws ValidationException {
        return next.validate(input);
    }
}
