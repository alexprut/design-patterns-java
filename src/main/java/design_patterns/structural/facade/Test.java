package design_patterns.behavioral.facade;

import java.lang.System;

class Test {
    public static void main(String args[]) {
        Facade f = new Facade();

        System.out.println(f.makeCoffee());
    }
}
