package dev.srylax.bbbassets.input.provider;

import dev.srylax.bbbassets.input.message.SwingMessageSpec;

import javax.swing.*;
import java.util.Objects;

public class SwingInputProvider extends BaseInputProvider<SwingMessageSpec, Object> {

    @Override
    protected Object getInput(SwingMessageSpec messageSpec, String errorMessage) {
        String message = messageSpec.getMessage() + System.lineSeparator()+ Objects.requireNonNullElse(errorMessage, "");
        return JOptionPane.showInputDialog(null,
                message,
                messageSpec.getTitle(),
                messageSpec.getMessageType(),
                null,
                messageSpec.getSelectionValues(),
                messageSpec.getInitialSelection());
    }
}
