package design_patterns.behavioral.flyweight;

class Test {
    public static void main(String[] args) {
        CoffeeShop shop = new CoffeeShop();
        shop.getOrder(1, "espresso");
        shop.getOrder(7, "macchiato");

        System.out.println(shop.toString());
    }
}
