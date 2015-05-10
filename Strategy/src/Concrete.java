class Concrete {
    protected Strategy strategy;

    public Concrete(Strategy strategy) {
        this.strategy = strategy;
    }

    public String algorithm() {
        return strategy.algorithm();
    }
}
