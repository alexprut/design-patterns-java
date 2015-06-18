class Test {
    public static void main(String[] args) {
        Test.display(new SpecialCreator());
    }

    public static void display(Creator c) {
        Product p = c.factoryMethod();

        System.out.println(p.getType());
    }
}
