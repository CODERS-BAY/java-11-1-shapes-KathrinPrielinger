
public class Square extends Shapes {

    private Integer width;

    //Construktor
  public Square (String color, Boolean isFilled, Integer width) {
        super(color, isFilled);
        this.width = width;
    }

    //Methoden
    public void negativeWidth(Integer actualWidth) throws IllegalArgumentException {
        if (width <= 0) {
            throw new IllegalArgumentException();
        } else {
            width = actualWidth;
        }
    }

    @Override
    public double getArea() {
        double resultArea = Math.pow(width, 2);
        return resultArea;
    }

    @Override
    public double getPerimeter() {
        double resultPerimeter = width * 4;
        return resultPerimeter;
    }
}