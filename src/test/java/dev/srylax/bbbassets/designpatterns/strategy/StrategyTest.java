package dev.srylax.bbbassets.designpatterns.strategy;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StrategyTest {

    @Test
    void testStrategyConsumer() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        StrategyContext<Strategy> context = new StrategyContext<>();
        context.setStrategy(new ConcreteStrategy());
        context.accept((e, c) -> e.someFunction());

        assertEquals("ConcreteStrategy.someFunction()", out.toString().trim());
    }

    @Test
    void testStrategyFunction() {
        StrategyContext<Strategy> context = new StrategyContext<>();
        context.setStrategy(new ConcreteStrategy());

        assertEquals("ConcreteStrategy.someOtherFunction()", context.apply((e, c) -> e.someOtherFunction()));
    }
}