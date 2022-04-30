package dev.srylax.bbbassets.designpatterns.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StateTest {


    @Test
    void testState() {
        ConcreteContext context = new ConcreteContext();
        context.setState(new ConcreteStateA());
        context.nextState();
        assertEquals(ConcreteStateB.class, context.getState().getClass());
    }

}