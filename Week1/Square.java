package Week1;



public class Square extends Rectangle{

    private double side;
    public Square(String name) {
        super("Square");
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

}
