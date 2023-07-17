package Week1;

import java.util.Scanner;

public class ShapeCalculator2 {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Please select: ");
            System.out.println("(1) Rectangle ");
            System.out.println("(2) Circle ");
            System.out.println("(3) Square ");

            int menu = input.nextInt();

            switch (menu){
                case 1:
                    Rectangle rec1 = new Rectangle("Rec");
                    System.out.println("Please input the width and height of the Rectangle");
                    System.out.println("Width: ");
                    rec1.setWidth(input.nextDouble());
                    System.out.println("Height: ");
                    rec1.setHeight(input.nextDouble());
                    rec1.printInfo();
                    break;
                case 2:
                    Circle cir1 = new Circle("Cir");
                    System.out.println("Please input the radius of the circle ");
                    System.out.println("Radius ");
                    cir1.setRadius(input.nextDouble());
                    cir1.printInfo();
                    break;
                case 3:

            }
        }

    }
}
