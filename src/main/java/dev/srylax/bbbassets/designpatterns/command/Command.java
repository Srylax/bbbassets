package dev.srylax.bbbassets.designpatterns.command;

import lombok.Data;

/**
 * The Command interface.
 * <img src="doc-files/command.png" alt="Command Interface">
 *
 * @param <T> the type of the Receiver
 */
@Data
public abstract class Command<T> {
    final T receiver;

    /**
     * Executes the command.
     * @return The modified Receiver. Used if you want to modify an Immutable or primitive Receiver.
     */
    public abstract T execute();

    /**
     * Undo the command.
     * @return The modified Receiver. Used if you want to modify an Immutable or primitive Receiver.
     */
    public T undo() {
        throw new UndoNotAvailableException();
    }
}
