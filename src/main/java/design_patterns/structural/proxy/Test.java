package design_patterns.behavioral.proxy;

class Test {
    public static void main(String[] args) {
        File[] files = new File[]{
            new ProxyProtectedFile(),
            new PublicFile()
        };

        for (File file : files) {
            System.out.println(file.read());
        }
    }
}
