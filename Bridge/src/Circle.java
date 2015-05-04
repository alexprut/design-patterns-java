class Circle extends Shape {
    public Circle(DrawProgram drawProgram) {
        super(drawProgram);
    }

    public String draw() {
        return drawProgram.drawCircle();
    }
}
