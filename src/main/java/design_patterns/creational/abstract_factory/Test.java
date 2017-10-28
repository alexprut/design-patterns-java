package design_patterns.behavioral.abstract_factory;

class Test {
    public static void main(String[] args) {
        AbstractFactory factory = new MaleAbstractFactory();
        Product gift = factory.makeGift();
        Product pack = factory.makePack();

        System.out.println(gift.toString() + " " + pack.toString());
    }
}
