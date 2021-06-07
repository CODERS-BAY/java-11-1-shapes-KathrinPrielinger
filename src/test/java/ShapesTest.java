import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ShapesTest {

    @Test
    public void testCircleArea() {
        Circle circle = new Circle("red", true, 10);
        assertEquals(circle.getArea(), 314.159);
    }

    @Test
    public void testCirclePerimeter() throws IOException {
        Circle circle = new Circle("red", true, 10);
        assertEquals(circle.getPerimeter(), 62.832);
    }

    @Test
    public void testRectangleArea() {
        Rectangle rectangle = new Rectangle("blue", true, 5, 10);
        assertEquals(rectangle.getArea(), 50);
    }

    @Test
    public void testRectanglePerimeter() {
        Rectangle rectangle = new Rectangle("lila", true, 5, 10);
        assertEquals(rectangle.getPerimeter(), 30);
    }

    @Test
    public void testSquareArea() {
        Square square = new Square("black", true, 10);
        assertEquals(square.getArea(), 100);
    }

    @Test
    public void testSquarePerimeter() {
        Square square = new Square ("grey", true, 10);
        assertEquals(square.getPerimeter(), 40);
    }


}