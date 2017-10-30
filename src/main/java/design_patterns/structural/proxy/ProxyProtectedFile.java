package design_patterns.structural.proxy;

class ProxyProtectedFile extends File {

  private File file;

  public ProxyProtectedFile() {
    file = new PublicFile();
  }

  public String read() {
    return isProtected ? "Read: File is Protected" : file.read();
  }
}