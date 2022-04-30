package dev.srylax.bbbassets.designpatterns.command;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * The Command interface.
 * <img src="doc-files/command.png" alt="Command Interface">
 *
 * @param <T> the type of the Receiver
 */
@Getter
@RequiredArgsConstructor
public abstract class Command<T> {
    protected final T receiver;

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
