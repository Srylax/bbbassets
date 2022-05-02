package dev.srylax.bbbassets.designpatterns.state;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * StateContext with a state.
 * <p>
 * <img src="doc-files/context.png" alt="StateContext">
 *
 * @param <T> The type of the state.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class StateContext<T extends State<?>> {
    /**
     * Current state.
     */
    protected T state;
}
