package app.shape;

import app.visitor.ShapeVisitor;

public final class Rectangle implements Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double width() {
        return width;
    }

    public double height() {
        return height;
    }

    @Override
    public <T> T accept(ShapeVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
