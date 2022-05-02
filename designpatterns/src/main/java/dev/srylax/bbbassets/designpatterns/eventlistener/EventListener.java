package dev.srylax.bbbassets.designpatterns.eventlistener;

/**
 * Interface for an Event-Listener.
 *
 * @param <T> Event type including the Payload
 */
public interface EventListener<T extends Event<?>> {
    /**
     * Gets called when an event is fired.
     * @param event Event that was fired including the payload
     */
    void onChange(T event);
}
