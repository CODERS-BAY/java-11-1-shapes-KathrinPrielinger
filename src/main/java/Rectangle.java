public class Rectangle extends Shapes {

    private Integer width;
    private Integer length;

    //Construktor


    public Rectangle(String color, Boolean isFilled, Integer width, Integer length) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    //Methoden
    public void negativeWidth(Integer actualWidth) throws IllegalArgumentException {
        if(width <= 0) {
            throw new IllegalArgumentException();
        }
        else {
            width = actualWidth;
        }
    }

    public void negativeLength(Integer actualLength) throws IllegalArgumentException {
        if(length <= 0) {
            throw new IllegalArgumentException();
        }
        else {
            length = actualLength;
        }
    }

    @Override
    public double getArea() {
        double resultArea = width * length;
        return resultArea;
    }

    @Override
    public double getPerimeter() {
        double resultPerimeter = (width*2) + (length*2);
        return resultPerimeter;
    }
}