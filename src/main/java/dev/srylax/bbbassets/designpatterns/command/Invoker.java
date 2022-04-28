package dev.srylax.bbbassets.designpatterns.command;

import lombok.Data;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @param <T>
 */
@Data
public class Invoker<T> {
    final Deque<Command<T>> stack = new LinkedList<>();

    public T execute(Command<T> command) {
        T value = command.execute();
        stack.offerLast(command);
        return value;
    }

    public T undoLast() {
        Command<T> command = stack.removeLast();
        return command.undo();
    }
}
