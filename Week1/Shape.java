package Week1;

import java.text.DecimalFormat;

public abstract class Shape {

    public String shapeName = "";
    public double area = 0;

    public Shape(String name) {
        this.shapeName = name;
    }

    public void printInfo() {
        calculateArea();
        System.out.println(this.shapeName);
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        System.out.println(decimalFormat.format(this.area));
    }

    public void setName(String newName) {
        this.shapeName = newName;
    }

    //please be noted that this is an abstract function
    public abstract void calculateArea();

}
