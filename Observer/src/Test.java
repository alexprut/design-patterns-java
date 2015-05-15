class Test {
    public static void main(String[] args) {
        Subject observed = new ConcreteSubject();
        Observer observer = new ConcreteObserver(observed);

        System.out.println(observed.getState());
        System.out.println(observer.toString());

        System.out.println("Update subject state:");
        observed.setState("itIsANewState");

        System.out.println(observed.getState());
        System.out.println(observer.toString());
    }
}
