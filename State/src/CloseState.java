class CloseState extends State {
    public State request() {
        return new OpenState();
    }

    public String toString() {
        return "Close State";
    }
}
