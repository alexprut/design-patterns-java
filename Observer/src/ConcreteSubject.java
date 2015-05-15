class ConcreteSubject extends Subject {
    private String state;

    public void setState(String s) {
        state = s;
        notifyObservers();
    }

    public String getState() {
        return state;
    }

    public String toString() {
        return state;
    }
}
