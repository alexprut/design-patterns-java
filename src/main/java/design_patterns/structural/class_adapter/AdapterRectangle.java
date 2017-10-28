package design_patterns.structural.class_adapter;

class AdapterRectangle extends Rectangle implements Figure {
    public void draw() {
        this.drawRectangle();
    }
}
