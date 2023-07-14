package abstraction;

public abstract class Shape {
    abstract void calculateArea();
}
class Circle extends Shape{
    int radius;
    public Circle(int radius){
        this.radius=radius;
    }
    @Override
    void calculateArea(){
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle :-" +area);
    }
}

class Rectangle extends Shape{
    int width;
    int height;
    public Rectangle(int width, int height){
        this.width=width;
        this.height=height;
    }
@Override
    void calculateArea(){
        double area=width * height;
        System.out.println("Area of Reactangle :-" +area);
    }
}
class ShapeImpl{
    public static void main(String[] args) {
      Shape shape=new Circle(5);
        Shape shape1=new Rectangle(2,4);
        shape1.calculateArea();
        shape.calculateArea();


    }
}