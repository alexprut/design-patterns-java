package design_patterns.behavioral.proxy;

abstract class File {
    protected boolean isProtected = true;

    public abstract String read();
}
