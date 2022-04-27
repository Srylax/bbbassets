package ch.bbbaden.bbbassets.designpatterns.eventlistener.event;

import lombok.Data;

/**
 * Event Class used with {@link ch.bbbaden.bbbassets.designpatterns.eventlistener.listener.EventListener}
 *
 * @param <T> the type of the changed value
 */
@Data
public class Event<T> {
    final Object source;
    final T value;
}