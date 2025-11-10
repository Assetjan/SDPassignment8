package app.shape;

import app.visitor.ShapeVisitor;

public final class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double radius() {
        return radius;
    }

    @Override
    public <T> T accept(ShapeVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
