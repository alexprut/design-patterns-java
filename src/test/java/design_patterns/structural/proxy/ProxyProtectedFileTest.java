package design_patterns.structural.proxy;

import org.junit.*;

public class ProxyProtectedFileTest {

  @Test
  public void readProtectedFile() {
    File file = new ProxyProtectedFile();

    Assert.assertEquals(file.read(), "Read: File is Protected");
  }

  @Test
  public void readUnprotectedFile() {
    File file = new ProxyProtectedFile();
    file.setProtection(false);

    Assert.assertEquals(file.read(), "Read: File");
  }
}