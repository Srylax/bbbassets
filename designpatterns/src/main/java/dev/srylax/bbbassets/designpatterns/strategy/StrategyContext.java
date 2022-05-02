package dev.srylax.bbbassets.designpatterns.strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/**
 * Context which includes a strategy. Should be extended by the concrete context.
 * <p>
 * Additional context to the strategy can be passed by adding the type of the StrategyContext to the execute Function.
 * <p>
 * <img src="doc-files/strategy-context.png" alt="Strategy Context">
 *
 * @param <S> Strategy interface
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StrategyContext<S> {
    protected S strategy;

    /**
     * Executes the desired function on a strategy.
     * <p>
     * For more context, the StrategyContext gets passed to the function.
     * To expand its interface, define the type at function call.
     *
     * @param function Function to execute on the strategy
     * @param <C>      Type of the StrategyContext
     * @param <R>      Type of the result
     * @return Result of the function
     */
    @SuppressWarnings("unchecked")
    public <C extends StrategyContext<S>, R> R apply(BiFunction<S, C, R> function) {
        return function.apply(strategy, (C) this);
    }

    /**
     * Executes the desired function on a strategy.
     * <p>
     * For more context, the StrategyContext gets passed to the function.
     * To expand its interface, define the type at function call.
     *
     * @param consumer Consumer to execute on the strategy
     * @param <C>      Type of the StrategyContext
     */
    @SuppressWarnings("unchecked")
    public <C extends StrategyContext<S>> void accept(BiConsumer<S, C> consumer) {
        consumer.accept(strategy, (C) this);
    }
}
