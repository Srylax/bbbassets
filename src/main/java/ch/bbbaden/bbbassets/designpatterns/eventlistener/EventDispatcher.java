package ch.bbbaden.bbbassets.designpatterns.eventlistener;

import ch.bbbaden.bbbassets.designpatterns.eventlistener.event.Event;
import ch.bbbaden.bbbassets.designpatterns.eventlistener.listener.EventListener;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Dispatches events to registered listeners.
 *
 * @param <T> The type of the event.
 */
public class EventDispatcher<T extends Event<?>> {

    /**
     * The list of registered listeners.
     */
    Collection<EventListener<T>> listeners = new ArrayList<>();

    /**
     * Registers a listener.
     *
     * @param listener The listener to register.
     */
    public void addEventListener(EventListener<T> listener) {
        listeners.add(listener);
    }

    /**
     * Dispatches an event to all registered listeners.
     *
     * @param event The event to dispatch.
     */
    public void fire(T event) {
        listeners.parallelStream().forEach(listener -> listener.onChange(event));
    }
}
