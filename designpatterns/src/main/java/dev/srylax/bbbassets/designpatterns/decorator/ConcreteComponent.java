package dev.srylax.bbbassets.designpatterns.decorator;

/**
 * Implements the Component interface and defines its concrete methods.
 * <p>
 * <img src="doc-files/concrete-component.png" alt="Concrete Component">
 */
public final class ConcreteComponent implements Component {

    /**
     * Concrete Operation. Outputs a message.
     */
    @Override
    public void operation() {
        System.out.println("Something");
    }
}
