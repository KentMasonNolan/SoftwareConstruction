package Week3;

import java.util.Random;
import java.util.Scanner;

public class Math_Quiz_Program {

    static String[] operatorList = {"-", "+", "/", "*"};

    static Random random = new Random();

    static int counter = 0;


    private int Score = 0;

    private static boolean userExit = false;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to our math game. You will be presented with a math problem. If you get the problem" +
                "correct, you will be awarded 10 points. If you get it wrong, you will be deducted 10 points.");

        System.out.println("Questions " + ++counter + ": ");

        int firstRandom = random.nextInt(101);
        int secondRandom = random.nextInt(101);
        int operatorRandom = random.nextInt(4);

        System.out.println(firstRandom + " " + operatorList[operatorRandom] + " " + secondRandom);

        double answer = 0;

        switch (operatorRandom){
            case 0: //this is the minus
                answer = firstRandom - secondRandom;
                break;
            case 1: //this is the plus
                answer = firstRandom + secondRandom;
                break;
            case 2: //this is the divide
                answer = firstRandom / secondRandom;
                break;
            case 3: //this is multiplication
                answer = firstRandom * secondRandom;
                break;
            default:
                System.out.println("If you see this, something went wrong");
                break;
        }

        double userAnswer = input.nextDouble();

        if (answer == userAnswer){
            System.out.println("You got it right! Good human.");
        } else {
            System.out.println("You are not as efficient as a robot and will be terminated.");
        }


    }


}
