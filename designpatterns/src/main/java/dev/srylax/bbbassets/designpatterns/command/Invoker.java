package dev.srylax.bbbassets.designpatterns.command;

import lombok.Data;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Executes the given command and stores it in the Stack.
 * <img src="doc-files/invoker.png" alt="Command Interface">
 *
 * @param <T> The type of the Receiver.
 */
@Data
public class Invoker<T> {

    /**
     * Command Stack. Is used as a history.
     */
    protected final Deque<Command<T>> stack = new LinkedList<>();

    /**
     * Executes a given Command and stores it in the Stack.
     *
     * @param command The Command to execute.
     * @return The modified Receiver. Used if you want to modify an Immutable or primitive Receiver.
     */
    public T execute(Command<T> command) {
        T value = command.execute();
        stack.offerLast(command);
        return value;
    }

    /**
     * Undo the last Command on the Stack. Removes it from the Stack.
     *
     * @return The modified Receiver. Used if you want to modify an Immutable or primitive Receiver.
     */
    public T undoLast() {
        Command<T> command = stack.removeLast();
        return command.undo();
    }
}
