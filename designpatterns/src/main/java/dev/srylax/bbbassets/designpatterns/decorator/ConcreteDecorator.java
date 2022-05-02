package dev.srylax.bbbassets.designpatterns.decorator;

/**
 * Implements the Decorator interface including the components interface.
 * <p>
 * <img src="doc-files/concrete-decorator.png" alt="Concrete Decorator">
 */
public final class ConcreteDecorator extends Decorator {


    /**
     * Constructor with the component to be decorated.
     *
     * @param component The component to be decorated.
     */
    public ConcreteDecorator(Component component) {
        super(component);
    }

    /**
     * Adds functionality to the component. Before and after executing the component's operation.
     */
    @Override
    public void operation() {
        System.out.println("before Something");
        this.component.operation();
        System.out.println("after Something");
    }
}
