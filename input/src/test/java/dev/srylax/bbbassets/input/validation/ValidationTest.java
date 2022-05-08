package dev.srylax.bbbassets.input.validation;

import dev.srylax.bbbassets.input.message.ConsoleMessageSpec;
import dev.srylax.bbbassets.input.provider.ConsoleInputProvider;
import dev.srylax.bbbassets.input.provider.InputProvider;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

class ValidationTest {

    @Test
    void testValidate() {
        String input = "-1" + System.lineSeparator()
                + "monkey" + System.lineSeparator()
                + "7" + System.lineSeparator()
                + "3" + System.lineSeparator();

        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);


        InputProvider<ConsoleMessageSpec, String> provider = new ConsoleInputProvider();

        ConsoleMessageSpec messageSpec = new ConsoleMessageSpec("Integer du lusche");

        Validator<Object, ?> validator = new IntegerValidator().and(new RangeValidator<>(1, 10)).and(new ContainsValidator<>(List.of(3,4)));


        Integer num = provider.input(messageSpec, Integer::parseInt, validator);
        System.out.println(num);
    }

}