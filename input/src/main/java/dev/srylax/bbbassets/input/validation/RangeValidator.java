package dev.srylax.bbbassets.input.validation;

public class RangeValidator<T extends Comparable<T>> extends Validator<T, Void> {
    private final T min;
    private final T max;

    public RangeValidator(T min, T max) {
        this.min = min;
        this.max = max;
    }

    @Override
    protected Void execValidate(T input) throws ValidationException {
        if (input.compareTo(min) < 0 || input.compareTo(max) > 0) {
            throw new ValidationException(String.format("Value must be between %s and %s", min, max));
        }
        return null;
    }
}
