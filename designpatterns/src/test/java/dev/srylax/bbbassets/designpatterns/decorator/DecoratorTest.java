package dev.srylax.bbbassets.designpatterns.decorator;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertLinesMatch;

class DecoratorTest {

    @Test
    void testDecorator() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        ConcreteComponent component = new ConcreteComponent();
        Decorator decorator = new ConcreteDecorator(component);
        decorator.operation();

        assertLinesMatch("""
                before Something
                Something
                after Something
                """.lines(), out.toString().lines());
    }
}