public class colorDecorator extends ShapeDecorator{
    Shape shape;
    String color;
    public colorDecorator(Shape s,String c)
    {
        shape=s;
        color=c;
    }
    public void draw()
    {
        System.out.print(color + " ");
        shape.draw();
    }
}
