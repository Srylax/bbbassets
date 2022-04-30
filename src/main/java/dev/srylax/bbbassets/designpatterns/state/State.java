package dev.srylax.bbbassets.designpatterns.state;

/**
 * The State interface declares a method for performing a state transition.
 * <p>
 * <img src="doc-files/state.png" alt="State">
 *
 * @param <T> the type of the Context
 */
public interface State<T extends Context<?>> {

    /**
     * Changes the state of the Context
     *
     * @param context the Context
     */
    void handle(T context);
}
