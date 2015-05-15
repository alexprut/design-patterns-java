class OpenState extends State {
    public State request() {
        return new CloseState();
    }

    public String toString() {
        return "Open State";
    }
}
