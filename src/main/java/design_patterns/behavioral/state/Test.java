package design_patterns.behavioral.state;

class Test {
    public static void main(String[] args) {
        Context c = new Context(new OpenState());

        c.request();
        System.out.println(c.toString());

        c.request();
        System.out.println(c.toString());
    }
}
