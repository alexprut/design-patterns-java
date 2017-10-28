package design_patterns.creational.prototype;

class FirstClonable extends Prototype {
    protected Prototype clone() {
        return this.clone();
    }
}
