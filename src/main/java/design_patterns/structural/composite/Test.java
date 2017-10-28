package design_patterns.behavioral.composite;

import java.lang.System;

class Test {
    public static void main(String args[]) {
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