package dev.srylax.bbbassets.designpatterns.state;

@SuppressWarnings("JavaDoc")
public class ConcreteStateA implements State<ConcreteStateContext> {
    @Override
    public void handle(ConcreteStateContext context) {
        context.setState(new ConcreteStateB());
    }
}
