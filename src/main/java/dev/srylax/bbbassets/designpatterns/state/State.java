package dev.srylax.bbbassets.designpatterns.state;

/**
 * The State interface declares a method for performing a state transition.
 * <p>
 * <img src="doc-files/state.png" alt="State">
 *
 * @param <T> the type of the StateContext
 */
public interface State<T extends StateContext<?>> {

    /**
     * Changes the state of the StateContext
     *
     * @param context the StateContext
     */
    void handle(T context);
}
