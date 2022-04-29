package dev.srylax.bbbassets.designpatterns.command;

import lombok.Data;

/**
 * The Command interface.
 *
 * @param <T> the type of the receiver
 */
@Data
public abstract class Command<T> {
    final T receiver;

    /**
     * Executes the command.
     *
     * @return the result of the command. If possible edit the Object by reference
     */
    public abstract T execute();

    /**
     * Undo the command.
     *
     * @return returns the target value. Use this if your target is a primitive Value or Immutable.
     */
    public T undo() {
        throw new UndoNotAvailableException();
    }
}
