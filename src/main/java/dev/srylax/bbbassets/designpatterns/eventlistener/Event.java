package dev.srylax.bbbassets.designpatterns.eventlistener;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Event Class used with {@link EventListener}
 *
 * @param <T> the type of the Payload
 */
@Getter
@RequiredArgsConstructor
public class Event<T> {
    protected final Object source;
    protected final T value;
}