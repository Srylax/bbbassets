package dev.srylax.bbbassets.designpatterns.state;

@SuppressWarnings("JavaDoc")
public class ConcreteStateContext extends StateContext<State<ConcreteStateContext>> {
    public void nextState() {
        this.state.handle(this);
    }
}
