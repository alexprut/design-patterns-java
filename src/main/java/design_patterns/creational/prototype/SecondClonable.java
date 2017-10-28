package design_patterns.behavioral.prototype;

class SecondClonable extends Prototype {
    protected Prototype clone() {
        return this.clone();
    }
}
