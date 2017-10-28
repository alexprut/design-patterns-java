package design_patterns.behavioral.class_adapter;

class Line implements Figure {
    public void draw() {
        System.out.println("Draw: Line");
    }
}