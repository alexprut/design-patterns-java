package design_patterns.structural.proxy;

import org.junit.*;

public class ProxyTest {

  @Test
  public void designPatternTest() {
    File[] files = new File[]{
        new ProxyProtectedFile(),
        new PublicFile()
    };

    Assert.assertEquals(files[0].read(), "Read: File is Protected");
    Assert.assertEquals(files[1].read(), "Read: File");
  }
}