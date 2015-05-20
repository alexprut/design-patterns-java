class Test {
    public static void main(String[] args) {
        ConcreteCompound compound = new ConcreteCompound("Iterator Design Pattern");
        Iterator iterator = compound.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
