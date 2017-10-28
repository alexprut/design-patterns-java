package design_patterns.creational.prototype;

class SecondClonable extends Prototype {
    protected Prototype clone() {
        return this.clone();
    }
}
