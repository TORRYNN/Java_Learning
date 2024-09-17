interface Shape {
    double area();

    double perimeter();
}

class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return (Math.PI) * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * (Math.PI) * radius;
    }
}

class Rectangle implements Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return length * breadth;
    }

    @Override
    public double perimeter() {
        return 2 * (length + breadth);
    }
}

public class Interfax {
    public static void main(String[] args) {
        Circle cobj = new Circle(10);
        System.out.println("Area " + cobj.area());
        System.out.println("Perimeter " + cobj.perimeter());
        Rectangle robj = new Rectangle(10, 20);
        System.out.println("Area " + robj.area());
        System.out.println("Perimeter " + robj.perimeter());
    }

}
