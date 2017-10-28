package design_patterns.structural.composite;

import java.util.ArrayList;
import java.util.ListIterator;

class Composite extends Figure {
    private ArrayList<Figure> figures = new ArrayList<Figure>();

    public String draw() {
        String s = "";

        ListIterator<Figure> iterator = figures.listIterator();

        while (iterator.hasNext()) {
            s = s + " " + iterator.next().draw();
        }

        return s;
    }

    public void remove(Figure figure) {
        figures.remove(figure);
    }

    public void add(Figure figure) {
        figures.add(figure);
    }
}
