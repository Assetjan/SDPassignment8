package app.visitor;

import app.shape.Circle;
import app.shape.Rectangle;

public interface ShapeVisitor<T> {
    T visit(Circle circle);
    T visit(Rectangle rectangle);
}
