package design_patterns.structural.proxy;

import org.junit.*;

public class ProxyTest {
    @Test
    public void mainTest() {
        File[] files = new File[]{
            new ProxyProtectedFile(),
            new PublicFile()
        };

        for (File file : files) {
            System.out.println(file.read());
        }
    }
}
