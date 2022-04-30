package dev.srylax.bbbassets.designpatterns.state;

@SuppressWarnings("JavaDoc")
public class ConcreteStateA implements State<ConcreteContext> {
    @Override
    public void handle(ConcreteContext context) {
        context.setState(new ConcreteStateB());
    }
}
