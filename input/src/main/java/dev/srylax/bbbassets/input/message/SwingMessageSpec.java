package dev.srylax.bbbassets.input.message;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.swing.*;

@Builder
@Setter
@Getter
public class SwingMessageSpec implements MessageSpec {
    private Object message;
    private String title;
    private Object[] selectionValues;
    private Object initialSelection;
    @Builder.Default private int messageType = JOptionPane.QUESTION_MESSAGE;
}
