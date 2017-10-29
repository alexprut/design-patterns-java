package design_patterns.behavioral.template_method;

class ConcreteClass extends AbstractClass {

  protected String doSomething() {
    return "I do something";
  }

  protected String doSomethingElse() {
    return "I do something else";
  }
}