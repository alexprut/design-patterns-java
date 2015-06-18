class OpenState extends State {
    public void request(Context context) {
        context.setState(new CloseState());
    }

    public String toString() {
        return "Open State";
    }
}
