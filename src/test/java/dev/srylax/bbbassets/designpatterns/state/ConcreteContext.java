package dev.srylax.bbbassets.designpatterns.state;

@SuppressWarnings("JavaDoc")
public class ConcreteContext extends Context<State<ConcreteContext>> {
    public void nextState() {
        this.state.handle(this);
    }
}
