package dev.srylax.bbbassets.designpatterns.state;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Context with a state.
 * <p>
 * <img src="doc-files/context.png" alt="Context">
 *
 * @param <T> The type of the state.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Context<T extends State<?>> {
    /**
     * Current state.
     */
    protected T state;
}
