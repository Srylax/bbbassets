package dev.srylax.bbbassets.designpatterns.eventlistener.event;

import dev.srylax.bbbassets.designpatterns.eventlistener.listener.EventListener;
import lombok.Data;

/**
 * Event Class used with {@link EventListener}
 *
 * @param <T> the type of the changed value
 */
@Data
public class Event<T> {
    final Object source;
    final T value;
}