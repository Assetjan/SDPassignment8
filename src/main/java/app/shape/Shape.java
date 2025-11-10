package app.shape;

import app.visitor.ShapeVisitor;

public interface Shape {
    <T> T accept(ShapeVisitor<T> visitor);
}
