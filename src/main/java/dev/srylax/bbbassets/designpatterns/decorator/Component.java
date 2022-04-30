package dev.srylax.bbbassets.designpatterns.decorator;

/**
 * Component interface.
 * <p>
 * <img src="doc-files/component.png" alt="Component">
 */
public sealed interface Component permits ConcreteComponent, Decorator {

    /**
     * Operation that does something.
     */
    void operation();
}
