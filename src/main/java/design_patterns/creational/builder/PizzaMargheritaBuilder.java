package design_patterns.behavioral.builder;

import java.util.ArrayList;

public class PizzaMargheritaBuilder extends PizzaBuilder {
    public PizzaMargheritaBuilder() {
        this.name = "margherita";
        this.ingredients = new ArrayList<String>() {{
            add("pomodoro");
            add("mozzarella");
        }};
    }
}
