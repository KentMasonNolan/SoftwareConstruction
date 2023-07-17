package Week1;

public class Circle extends Shape {

    private double radius;

    public Circle(String name) {
        super("Circle");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        this.area = Math.pow(this.radius, 2) * Math.PI;

    }
}
