package design_patterns.behavioral.command;

abstract class Command {

  Receive r;

  public Command(Receive r) {
    this.r = r;
  }

  public abstract void execute();
}