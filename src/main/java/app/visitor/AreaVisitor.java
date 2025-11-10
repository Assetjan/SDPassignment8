package app.visitor;

import app.shape.Circle;
import app.shape.Rectangle;

public final class AreaVisitor implements ShapeVisitor<Double> {
    @Override
    public Double visit(Circle circle) {
        double r = circle.radius();
        return Math.PI * r * r;
    }

    @Override
    public Double visit(Rectangle rectangle) {
        return rectangle.width() * rectangle.height();
    }
}
