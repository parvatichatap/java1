package polymorphism;

class Shape {
    public float calculateArea() {
        System.out.println("Calculating area...");
        return -1;
    }
}

class Circle extends Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public float calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
        return -1;
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public float calculateArea() {
        double area = side * side;
        System.out.println("Area of the square: " + area);
        return -1;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public float calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of the triangle: " + area);
        return -1;
    }
}

class ShapeImpl {
    public static void main(String[] args) {
        Shape s=new Shape();
       s = new Circle(5);
        s = new Square(4.0);
      s = new Triangle(3.0, 6.0);

       s.calculateArea();
//        s.calculateArea();
//        s.calculateArea();
    }
}
