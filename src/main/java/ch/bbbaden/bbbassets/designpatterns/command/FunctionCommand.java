package ch.bbbaden.bbbassets.designpatterns.command;

import java.util.function.Function;

public class FunctionCommand<T> extends Command<T> {
    final Function<T, T> function;

    public FunctionCommand(Function<T, T> function, T receiver) {
        super(receiver);
        this.function = function;
    }

    @Override
    public T execute() {
        return function.apply(receiver);
    }
}
