package design_patterns.behavioral.iterator;

import org.junit.*;

public class IteratorTest {
    @Test
    public void mainTest() {
        ConcreteCompound compound = new ConcreteCompound("Iterator Design Pattern");
        Iterator iterator = compound.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
