package design_patterns.behavioral.observer;

class ConcreteObserver extends Observer {
    public ConcreteObserver(Subject observed) {
        super(observed);
    }

    public void update() {
        observedState = observed.getState();
    }

    public String toString() {
        return observedState;
    }
}
