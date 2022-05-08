package dev.srylax.bbbassets.input.validation;


import java.util.Collection;

public class ContainsValidator<T> extends Validator<T, Void> {

    private final Collection<T> collection;

    public ContainsValidator(Collection<T> collection) {
        this.collection = collection;
    }

    @Override
    protected Void execValidate(T input) throws ValidationException {
        if (!collection.contains(input))
            throw new ValidationException(String.format("%s is not in the list of possibles values" + System.lineSeparator() + "Possibles values: %s",
                    input,
                    collection));
        return null;
    }
}
