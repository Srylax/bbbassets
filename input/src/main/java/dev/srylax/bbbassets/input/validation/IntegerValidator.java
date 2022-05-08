package dev.srylax.bbbassets.input.validation;

public class IntegerValidator extends Validator<Object, Integer> {

    @Override
    protected Integer execValidate(Object input) throws ValidationException {
        if (input instanceof Integer value) return value;
        if (input instanceof Number value) return value.intValue();
        try {
            if (input instanceof String value) return Integer.parseInt(value);
        } catch (NumberFormatException ignore) {}

        throw new ValidationException("Invalid integer value");
    }
}
