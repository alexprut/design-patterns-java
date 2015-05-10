class Test {
    public static void main(String[] args) {
        Concrete firstAlg = new Concrete(new FirstStrategy());
        Concrete secondAlg = new Concrete(new SecondStrategy());

        System.out.println(firstAlg.algorithm());
        System.out.println(secondAlg.algorithm());
    }
}
