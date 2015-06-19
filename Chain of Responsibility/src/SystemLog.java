public class SystemLog extends Chain {
    public SystemLog() {
        super.priority = Chain.ERR_SYSTEM;
    }

    public void writeMessage() {
        System.out.println("System error logged");
    }
}
