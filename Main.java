
abstract class Shape {

    public abstract void RectangleArea(double length, double breadth);

    public abstract void SquareArea(double side);

    public abstract void CircleArea(double radius);
}

class Area extends Shape {

    @Override
    public void RectangleArea(double length, double breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    @Override
    public void SquareArea(double side) {
        System.out.println("Area of Square: " + (side * side));
    }

    @Override
    public void CircleArea(double radius) {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}

public class Main {

    public static void main(String[] args) {

        Area a = new Area();

        a.RectangleArea(10, 5);

        a.SquareArea(5);

        a.CircleArea(7);
    }
}

