package dev.srylax.bbbassets.input.provider;

import dev.srylax.bbbassets.input.message.ConsoleMessageSpec;

import java.util.Scanner;

public class ConsoleInputProvider extends BaseInputProvider<ConsoleMessageSpec,String> {

    Scanner scanner = new Scanner(System.in);

    @Override
    protected String getInput(ConsoleMessageSpec messageSpec, String errorMessage) {
        System.out.println(messageSpec.getMessage());
        if (errorMessage !=null )System.out.println(errorMessage);
        return scanner.nextLine();
    }
}
