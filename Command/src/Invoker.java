import java.util.ArrayList;
import java.util.Iterator;

class Invoker {
    ArrayList<Command> commands = new ArrayList<Command>();

    public void setCommandAndExecute(Command c) {
        commands.add(c);
        c.execute();
    }

    public String toString() {
        String output = "History:";
        Iterator<Command> commandIterator = commands.iterator();

        while (commandIterator.hasNext()) {
            output += "\n" + commandIterator.next().toString();
        }

        return output;
    }
}
