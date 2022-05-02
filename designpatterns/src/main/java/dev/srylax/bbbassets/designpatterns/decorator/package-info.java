/**
 * Decorator pattern.
 * <p>
 * Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.
 * <p>
 * It is not possible to implement a general purpose decorator pattern. Because of this, this implementation is only for show purposes.
 * <p>
 * The class that uses these functions would look as follows:
 * <pre>
 * {@code
 * public class Main {
 *    public static void main(String[] args) {
 *       ConcreteComponent component = new ConcreteComponent();
 *       Decorator decorator = new ConcreteDecorator(component);
 *       decorator.operation();
 *      }
 * }
 * }
 * </pre>
 * <p>
 * <img src="doc-files/decorator-pattern.png" alt="Decorator Pattern">
 * <p>
 * <a href="https://java-design-patterns.com/patterns/decorator/">Decorator Pattern</a>
 */
package dev.srylax.bbbassets.designpatterns.decorator;