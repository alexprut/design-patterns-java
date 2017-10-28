package design_patterns.structural.composite;

import org.junit.*;
import java.lang.System;

public class CompositeTest {
    @Test
    public void mainTest() {
        Figure point = new Point();
        Figure line = new Line();
        Figure composite = new Composite();

        // Make a composite with a Point + Line
        composite.add(point);
        composite.add(line);

        System.out.println(composite.draw());

        composite.remove(point);

        System.out.println(composite.draw());
    }
}