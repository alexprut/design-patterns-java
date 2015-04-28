import java.lang.System;

class Test {
    public static void main(String args[]) {
        Figure[] figures;

        figures = new Figure[2];
        figures[0] = new Line();
        figures[1] = new AdapterRectangle();

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}