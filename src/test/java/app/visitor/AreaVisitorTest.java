package app.visitor;

import app.shape.Circle;
import app.shape.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

final class AreaVisitorTest {
    @Test
    void circleArea() {
        var v = new AreaVisitor();
        var c = new Circle(1.0);
        assertEquals(Math.PI, v.visit(c), 1e-9);
    }

    @Test
    void rectangleArea() {
        var v = new AreaVisitor();
        var r = new Rectangle(3.0, 4.0);
        assertEquals(12.0, v.visit(r), 1e-9);
    }
}
