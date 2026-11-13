class Shape{

    private String color = "Boolean";
    private boolean filled = true;

    public Shape(){
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color,boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "A Shape with color of " + color ;
    }
}

class Circle extends Shape {

    private double radius = 0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return 3.14*radius*radius;
    }

    public double getPerimeter(){
        return 2*3.14*radius;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() +
               ", radius=" + radius + "]";
    }
}

class Rectangle extends Shape {

    private double width = 1.0;
    private double height = 1.0;

    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled,
                     double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString() +
               ", width=" + width +
               ", height=" + height + "]";
    }
}


class Square extends Rectangle {

    public Square() {
        super(1.0, 1.0);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}


public class classin {
    public static void main(String[] args) {

        Shape shape = new Shape("Blue", true);
        System.out.println("----- SHAPE -----");
        System.out.println(shape);

        Circle circle = new Circle("Red", true, 5.0);
        System.out.println("\n----- CIRCLE -----");
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());


        Rectangle rectangle = new Rectangle("Green", false, 10.0, 5.0);
        System.out.println("\n----- RECTANGLE -----");
        System.out.println(rectangle);
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());


        Square square = new Square("Yellow", true, 5.0);
        System.out.println("\n----- SQUARE -----");
        System.out.println(square);
        System.out.println("Side: " + square.getSide());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());

        System.out.println("\n----- MODIFY SQUARE -----");


        square.setWidth(10.0);

        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
    }
}
