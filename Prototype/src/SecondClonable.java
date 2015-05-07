class SecondClonable extends Prototype {
    protected Prototype clone() {
        return this.clone();
    }
}
