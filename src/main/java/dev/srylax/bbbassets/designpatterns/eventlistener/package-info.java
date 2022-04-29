/**
 * Newer version of the Observer pattern. <br>
 * {@link dev.srylax.bbbassets.designpatterns.eventlistener.event.Event} contain a payload, which is a generic type. <br>
 * These Events are Dispatched through an {@link dev.srylax.bbbassets.designpatterns.eventlistener.EventDispatcher}. <br>
 * To receiver an Event, you need to implement and register an {@link dev.srylax.bbbassets.designpatterns.eventlistener.listener.EventListener} to the {@link dev.srylax.bbbassets.designpatterns.eventlistener.EventDispatcher}. <br>
 * <p>
 * Observer pattern: <P>
 * Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
 * <a href="https://java-design-patterns.com/patterns/observer/">Observer Pattern</a>
 */
package dev.srylax.bbbassets.designpatterns.eventlistener;