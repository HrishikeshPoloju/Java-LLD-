// class AreaCalculator {
//     public double calculateArea(Object shape) {
//         if (shape instanceof Circle) {
//             Circle c = (Circle) shape;
//             return Math.PI * c.radius * c.radius;
//         } else if (shape instanceof Rectangle) {
//             Rectangle r = (Rectangle) shape;
//             return r.length * r.breadth;
//         }
//         return 0;
//     }
// }

abstract class AreaCalculator {
    public abstract double area ();  
}

class Circle extends AreaCalculator{
    private double radius;
     Circle (double radius){
        this.radius=radius;
    }
    @Override
    public double area(){
        return Math.PI*radius*radius;
    }
}

class Rectangle extends AreaCalculator{
    private double length;
    private double breadth;
    
    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    
    @Override
    public double area(){
        return length * breadth;
    }
}

public class OCpDemo {
    public static void main(String[] args) {
        AreaCalculator circle = new Circle(5.0);
        AreaCalculator rectangle = new Rectangle(4.0, 6.0);
        
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}
