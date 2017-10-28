package design_patterns.behavioral.prototype;

abstract class Prototype implements Cloneable {
    protected abstract Prototype clone();
}
