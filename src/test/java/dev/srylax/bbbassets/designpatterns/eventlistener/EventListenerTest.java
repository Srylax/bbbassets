package dev.srylax.bbbassets.designpatterns.eventlistener;

import dev.srylax.bbbassets.designpatterns.eventlistener.event.Event;
import dev.srylax.bbbassets.designpatterns.eventlistener.listener.EventListener;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

class EventListenerTest {

    private final Event<String> event = new Event<>(this, "Hello");
    @Mock
    private EventListener<Event<String>> eventListener;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void eventListenerTest() {
        EventDispatcher<Event<String>> dispatcher = new EventDispatcher<>();
        dispatcher.addEventListener(eventListener);
        dispatcher.fire(event);
        Mockito.verify(eventListener).onChange(event);
    }
}