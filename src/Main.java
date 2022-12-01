public class Main {
    public static void main(String[] args) {

        ShapeDecorator tr = new GlowDecorator(new colorDecorator(new Triangel(), "Color"), true);
        tr.draw();

        Shape tp = new Trapezium();
        ShapeDecorator glow2 = new GlowDecorator(tp, true);
        ShapeDecorator c2 = new colorDecorator(glow2, "Blue");
        c2.draw();
    }
}