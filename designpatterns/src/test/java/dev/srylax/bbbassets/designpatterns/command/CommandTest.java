package dev.srylax.bbbassets.designpatterns.command;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CommandTest {

    @org.junit.jupiter.api.Test
    void commandTest() {
        String receiverString = "hallo";
        Invoker<String> invoker = new Invoker<>();
        Command<String> reverser = new FunctionCommand<>(String::toUpperCase, receiverString);
        assertEquals("HALLO", invoker.execute(reverser));
    }

    @org.junit.jupiter.api.Test
    void undoTest() {
        String receiverString = "hallo";
        Invoker<String> invoker = new Invoker<>();
        Command<String> reverser = new FunctionCommand<>(String::toUpperCase, receiverString);
        assertEquals("HALLO", invoker.execute(reverser));
        assertThrows(UndoNotAvailableException.class, invoker::undoLast);
    }

    @Test
    void emptyTest() {
        Invoker<String> invoker = new Invoker<>();
        assertThrows(NoSuchElementException.class, invoker::undoLast);
    }
}