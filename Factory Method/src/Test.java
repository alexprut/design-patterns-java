class Test {
    public static void main(String[] args) {
        Creator c;
        Product p;

        c = new SpecialCreator();
        p = c.factoryMethod();

        System.out.println(p.getType());
    }
}
