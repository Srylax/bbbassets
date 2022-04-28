package dev.srylax.bbbassets.designpatterns.command;

public class UndoNotAvailableException extends RuntimeException {
    public UndoNotAvailableException() {
        super("Undo not available");
    }
}
