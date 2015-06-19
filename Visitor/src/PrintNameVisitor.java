public class PrintNameVisitor extends Visitor {
    public String visit(Circle figure) {
        return figure.name;
    }

    public String visit(Square figure) {
        return figure.name;
    }
}
