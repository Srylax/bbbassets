package ch.bbbaden.bbbassets.designpatterns.command;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CommandTest {

    @org.junit.jupiter.api.Test
    void commandTest() {
        String receiverString = "hallo";
        Invoker<String> invoker = new Invoker<>();
        Command<String> reverser = new FunctionCommand<>(String::toUpperCase, receiverString);
        assertEquals("HALLO", invoker.execute(reverser));
    }
}