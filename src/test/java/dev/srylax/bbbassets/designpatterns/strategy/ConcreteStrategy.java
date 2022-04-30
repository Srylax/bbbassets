package dev.srylax.bbbassets.designpatterns.strategy;

@SuppressWarnings("JavaDoc")
public class ConcreteStrategy implements Strategy {
    @Override
    public void someFunction() {
        System.out.println("ConcreteStrategy.someFunction()");
    }

    @Override
    public String someOtherFunction() {
        return "ConcreteStrategy.someOtherFunction()";
    }
}
