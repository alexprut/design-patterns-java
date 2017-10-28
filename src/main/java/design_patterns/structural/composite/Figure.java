package design_patterns.behavioral.composite;

abstract class Figure {
    public String draw() {
        return "";
    };

    public void add(Figure figure) {};

    public void remove(Figure figure) {};
}
