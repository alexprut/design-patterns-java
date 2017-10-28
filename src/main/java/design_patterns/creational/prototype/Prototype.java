package design_patterns.creational.prototype;

abstract class Prototype implements Cloneable {
    protected abstract Prototype clone();
}
