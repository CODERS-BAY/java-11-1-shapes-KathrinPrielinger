import java.util.ArrayList;
import java.util.List;
import static java.lang.Math.PI;

public class Main {

    public static void main(String[] args) {

        List<Shapes> allShapes = new ArrayList<>();
        Rectangle rectangleOne = new Rectangle ("blue", true, 4, 2);
        Circle circleOne = new Circle ("red", true, 3);
        Square squareOne = new Square ("green", true, 3);

        allShapes.add(rectangleOne);
        allShapes.add(circleOne);
        allShapes.add(squareOne);
        System.out.println(allShapes);

        for (Shapes shape : allShapes) {
            if (shape instanceof Circle) {
                ((Circle) shape).getArea();
            }
            else if (shape instanceof Rectangle) {
                ((Rectangle) shape).getPerimeter();
            }
            else if (shape instanceof Square) {
                ((Square) shape).getArea();
            }

        }

    }

}
