package Week1;

public class Rectangle extends Shape{

    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle(String name) {
        super("Rectangle");
    }

    @Override
    public void calculateArea() {

        this.area = this.height * this.width;


    }
}
