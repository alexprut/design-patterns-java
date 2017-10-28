package design_patterns.behavioral.prototype;

class FirstClonable extends Prototype {
    protected Prototype clone() {
        return this.clone();
    }
}
