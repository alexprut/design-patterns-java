public class Test {
    public static void main(String[] args) {
        PizzaMargheritaBuilder pizzaBuilder = new PizzaMargheritaBuilder();
        pizzaBuilder.setPrice(3);
        Pizza pizza = pizzaBuilder.getPizza();

        System.out.print(pizza.toString());
    }
}
