package dev.srylax.bbbassets.designpatterns.proxy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.function.Function;

/**
 * Proxy for an Object.
 *
 * @param <T> The type of the object to be proxied.
 */
@Getter
@Setter
@AllArgsConstructor
public class Proxy<T> {
    protected final T subject;

    /**
     * Executes a function on the proxied object.
     *
     * @param function The function to be executed.
     * @param <R>      The return type of the function.
     * @return The result of the function.
     */
    public <R> R execute(Function<T, R> function) {
        return function.apply(subject);
    }
}
