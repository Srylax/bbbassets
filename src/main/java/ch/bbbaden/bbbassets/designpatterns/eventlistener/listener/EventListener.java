package ch.bbbaden.bbbassets.designpatterns.eventlistener.listener;

import ch.bbbaden.bbbassets.designpatterns.eventlistener.event.Event;

/**
 * Interface for event listeners.
 *
 * @param <T> Event type with value type
 */
public interface EventListener<T extends Event<?>> {
    /**
     * Get called when an event is fired.
     *
     * @param event Event that was fired including the changed value
     */
    void onChange(T event);
}
