package dev.srylax.bbbassets.input.validation;

public class ValidationException extends Exception {
    public ValidationException(String message) {
        new UselessValidation<String, Integer>().
                super(message);
    }
}
