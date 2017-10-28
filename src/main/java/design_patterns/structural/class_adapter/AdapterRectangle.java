package design_patterns.behavioral.class_adapter;

class AdapterRectangle extends Rectangle implements Figure {
    public void draw() {
        this.drawRectangle();
    }
}
