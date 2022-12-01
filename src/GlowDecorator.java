public class GlowDecorator extends ShapeDecorator{
    Shape shape;
    boolean glowing;
    public GlowDecorator(Shape s,boolean g)
    {
        shape=s;
        glowing = g;
    }
    public void draw()
    {
        if (glowing) System.out.print("Glowing" + " ");
        else System.out.print("Not Glowing" + " ");
        shape.draw();
    }
}
