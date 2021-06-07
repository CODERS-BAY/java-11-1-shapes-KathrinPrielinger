public class Circle extends Shapes {

    private Integer radius;


    //Construktor
    public Circle(String color, Boolean isFilled, Integer radius) {
        super(color, isFilled);
        this.radius = radius;

    }

    //Methoden
    public void negativeRadius(Integer actual) throws IllegalArgumentException {
        if(radius <= 0) {
            throw new IllegalArgumentException();
        }
        else {
            radius = actual;
        }
    }

    @Override
    public double getArea() {
        double resultArea = Math.round(1000.0 * (Math.PI * (Math.pow(radius, 2)))) / 1000.0;
        return resultArea;
    }

    @Override
    public double getPerimeter() {
        double resultPerimeter = Math.round(1000.0 * ((2 * radius) * Math.PI)) / 1000.0;
        return resultPerimeter;
    }
}
