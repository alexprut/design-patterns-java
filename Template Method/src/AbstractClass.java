abstract class AbstractClass {
    protected abstract String doSomething();

    protected abstract String doSomethingElse();

    public String templateMethod() {
        return doSomething() + " then " + doSomethingElse();
    }
}
