abstract class Shape {
    public abstract void printName();
}

class Circle extends Shape {
    @Override
    public void printName() {
        System.out.println("Circle");
    }
}

class Square extends Shape {
    @Override
    public void printName() {
        System.out.println("Square");
    }
}

class Triangle extends Shape {
    @Override
    public void printName() {
        System.out.println("Triangle");
    }
}

class Rectangle extends Shape {
    @Override
    public void printName() {
        System.out.println("Rectangle");
    }
}

class ShapeNamePrinter {
    public void printShapeName(Shape shape) {
        shape.printName();
    }
}

public class Main {
    public static void main(String[] args) {
        ShapeNamePrinter printer = new ShapeNamePrinter();

        Shape circle = new Circle();
        Shape square = new Square();
        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();

        printer.printShapeName(circle);
        printer.printShapeName(square);
        printer.printShapeName(triangle);
        printer.printShapeName(rectangle);
    }
}