public class Test {
    public static void main(String[] args) {
        Visitor visitor = new PrintNameVisitor();
        Circle circle = new Circle();
        Square square = new Square();

        System.out.println(visitor.visit(circle));
        System.out.println(visitor.visit(square));
    }
}
