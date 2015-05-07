class FirstClonable extends Prototype {
    protected Prototype clone() {
        return this.clone();
    }
}
