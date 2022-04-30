package dev.srylax.bbbassets.designpatterns.state;

@SuppressWarnings("JavaDoc")
public class ConcreteStateB implements State<ConcreteStateContext> {
    @Override
    public void handle(ConcreteStateContext context) {
        context.setState(new ConcreteStateA());
    }
}
