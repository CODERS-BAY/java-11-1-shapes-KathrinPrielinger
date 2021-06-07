public abstract class Shapes {

    private String color;
    private Boolean isFilled;

    public Shapes(String color, Boolean isFilled) {

        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return isFilled;
    }

    public void setFilled(Boolean filled) {
        isFilled = filled;
    }

    //Methoden
    public abstract double getArea();

    public abstract double getPerimeter();
}
