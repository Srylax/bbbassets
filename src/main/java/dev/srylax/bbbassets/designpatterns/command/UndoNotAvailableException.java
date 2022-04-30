package dev.srylax.bbbassets.designpatterns.command;

/**
 * Exception thrown when an undo operation is requested but no undo operation is available.
 */
public class UndoNotAvailableException extends RuntimeException {

    /**
     * Constructs an UndoNotAvailableException with no detail message.
     */
    public UndoNotAvailableException() {
        super("Undo not available");
    }
}
