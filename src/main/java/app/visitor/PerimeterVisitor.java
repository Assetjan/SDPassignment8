package app.visitor;

import app.shape.Circle;
import app.shape.Rectangle;

public final class PerimeterVisitor implements ShapeVisitor<Double> {
    @Override
    public Double visit(Circle circle) {
        double r = circle.radius();
        return 2 * Math.PI * r;
    }

    @Override
    public Double visit(Rectangle rectangle) {
        return 2 * (rectangle.width() + rectangle.height());
    }
}
