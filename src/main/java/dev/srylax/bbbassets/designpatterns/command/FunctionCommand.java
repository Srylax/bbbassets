package dev.srylax.bbbassets.designpatterns.command;

import java.util.function.Function;

/**
 * A concrete implementation of {@link Command} that wraps a {@link Function}
 * <img src="doc-files/concrete-command.png" alt="Implementation of Command Interface">
 *
 * @param <T> Type of the Receiver
 */
public class FunctionCommand<T> extends Command<T> {

    /**
     * The {@link Function} to be executed
     */
    final Function<T, T> function;

    /**
     * Constructor for {@link FunctionCommand}
     *
     * @param function The {@link Function} to be executed
     * @param receiver The Receiver to be executed on
     */
    public FunctionCommand(Function<T, T> function, T receiver) {
        super(receiver);
        this.function = function;
    }

    /**
     * Applies the {@link Function} on the Receiver
     *
     * @return The modified Receiver. Used if you want to modify an Immutable or primitive Receiver.
     */
    @Override
    public T execute() {
        return function.apply(receiver);
    }
}
