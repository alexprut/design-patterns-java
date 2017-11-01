package design_patterns.behavioral.command;

import java.util.ArrayList;

class Invoker {

  private ArrayList<Command> commands = new ArrayList<Command>();

  public void setCommandAndExecute(Command c) {
    commands.add(c);
    c.execute();
  }

  public String toString() {
    String output = "History:";

    for (Command command : commands) {
      output += "\n" + command.toString();
    }

    return output;
  }
}
