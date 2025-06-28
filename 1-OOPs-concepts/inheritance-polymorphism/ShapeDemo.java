abstract class Shape {
    protected String name;

    Shape(String name) {
        this.name = name;
    }

    public abstract void area();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public void area() {
        System.out.println(name + " area: " + (length * width));
    }
}

class Circle extends Shape {
    private double radius;

    Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void area() {
        double a = Math.PI * radius * radius;
        System.out.println(name + " area: " + a);
    }
}

class ShapeDemo {
    public static void main(String[] args) {
        Shape s1 = new Rectangle("MyRectangle", 4, 5);
        Shape s2 = new Circle("MyCircle", 3);

        Shape[] shapes = { s1, s2 };
        for (Shape shape : shapes) {
            shape.area();
        }
    }
}
