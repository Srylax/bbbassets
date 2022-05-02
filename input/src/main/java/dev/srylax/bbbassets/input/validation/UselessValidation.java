package dev.srylax.bbbassets.input.validation;

public class UselessValidation<T> extends ValidationMiddleware<T, String> {
    @Override
    String validate(T input) throws ValidationException {
        String newInput = input.toString();
        validateNext(newInput);
        return newInput;
    }
}
