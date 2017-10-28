package design_patterns.behavioral.decorator;

class Test {
    public static void main(String args[]) {
        Coffee c = new SimpleCoffee();
        Coffee custom = new Sugar(new Milk(c));

        System.out.println(custom.getIngredients());
        System.out.println(custom.getCost());
    }
}