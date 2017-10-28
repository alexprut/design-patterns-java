package design_patterns.behavioral.template_method;

class Test {
    public static void main(String[] args) {
        AbstractClass c = new ConcreteClass();

        System.out.print(c.templateMethod());
    }
}
