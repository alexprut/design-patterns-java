package design_patterns.behavioral.command;

abstract class Command {

  protected Receiver r;

  public Command(Receiver r) {
    this.r = r;
  }

  public abstract void execute();
}