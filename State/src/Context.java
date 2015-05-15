class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void request() {
        state = state.request();
    }

    public String toString() {
        return "Context with: " + state.toString();
    };
}
