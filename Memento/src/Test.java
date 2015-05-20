import java.util.ArrayList;

class Test {
    public static void main(String[] args) {
        ArrayList<Memento> savedStates = new ArrayList<Memento>();
        Originator origin = new Originator();

        origin.setState("First");
        System.out.println(origin.toString());
        origin.setState("Second");
        System.out.println(origin.toString());
        savedStates.add(origin.saveToMemento());
        origin.setState("First");
        System.out.println(origin.toString());
        origin.restoreFromMemento(savedStates.get(0));
        System.out.println(origin.toString());
    }
}
