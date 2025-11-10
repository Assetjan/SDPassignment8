package app;

import app.shape.Circle;
import app.shape.Rectangle;
import app.visitor.AreaVisitor;
import app.visitor.PerimeterVisitor;

public final class Main {
    public static void main(String[] args) {
        var circle = new Circle(2.0);
        var rectangle = new Rectangle(3.0, 4.0);

        var areaVisitor = new AreaVisitor();
        var perimeterVisitor = new PerimeterVisitor();

        double circleArea = circle.accept(areaVisitor);
        double rectArea = rectangle.accept(areaVisitor);

        double circlePerimeter = circle.accept(perimeterVisitor);
        double rectPerimeter = rectangle.accept(perimeterVisitor);

        System.out.println("Circle area: " + circleArea);
        System.out.println("Rectangle area: " + rectArea);
        System.out.println("Circle perimeter: " + circlePerimeter);
        System.out.println("Rectangle perimeter: " + rectPerimeter);
    }
}
