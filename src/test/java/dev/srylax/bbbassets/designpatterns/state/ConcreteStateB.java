package dev.srylax.bbbassets.designpatterns.state;

@SuppressWarnings("JavaDoc")
public class ConcreteStateB implements State<ConcreteContext> {
    @Override
    public void handle(ConcreteContext context) {
        context.setState(new ConcreteStateA());
    }
}
