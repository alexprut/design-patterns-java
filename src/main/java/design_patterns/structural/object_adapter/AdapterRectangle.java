package design_patterns.behavioral.object_adapter;

class AdapterRectangle implements Figure {
    private Rectangle rectangle = new Rectangle();
    public void draw() {
        rectangle.drawRectangle();
    }
}
