package design_patterns.behavioral.template_method;

import org.junit.*;

public class TemplateMethodTest {
    @Test
    public void mainTest() {
        AbstractClass c = new ConcreteClass();

        System.out.print(c.templateMethod());
    }
}
