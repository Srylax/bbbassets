package dev.srylax.bbbassets.designpatterns.decorator;

/**
 * Decorator used to add functionality to a component. Implements the Components interface and includes the component.
 * <p>
 * <img src="doc-files/decorator.png" alt="Decorator">
 */
public abstract sealed class Decorator implements Component permits ConcreteDecorator {

    /**
     * The component to be decorated.
     */
    protected final Component component;

    /**
     * Constructor.
     *
     * @param component The component to be decorated.
     */
    protected Decorator(Component component) {
        this.component = component;
    }
}
