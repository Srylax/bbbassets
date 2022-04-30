package dev.srylax.bbbassets.designpatterns.eventlistener;

import lombok.Data;

/**
 * Event Class used with {@link EventListener}
 *
 * @param <T> the type of the Payload
 */
@Data
public class Event<T> {
    protected final Object source;
    protected final T value;
}