package Week3;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Math_Quiz_Program {

    static String[] operatorList = {"-", "+", "/", "*"};

    static Random random = new Random();

    static int counter = 0;

    private static int score = 0;

    private static boolean userExit = false;

    private static final double ACCEPTABLE_ERROR = 0.01;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to our math game. You will be presented with a math problem. If you get the problem" + " correct, you will be awarded 10 points. If you get it wrong, you will be deducted 10 points.");

        while (!userExit) {
            try {
                System.out.println("Questions " + ++counter + ": ");

                int firstRandom = random.nextInt(101);
                int secondRandom = random.nextInt(101);
                int operatorRandom = random.nextInt(4);

                System.out.println(firstRandom + " " + operatorList[operatorRandom] + " " + secondRandom);

                double answer = 0;

                switch (operatorRandom) {
                    case 0:
                        answer = firstRandom - secondRandom;
                        System.out.println(answer);
                        break;
                    case 1:
                        answer = firstRandom + secondRandom;
                        System.out.println(answer);
                        break;
                    case 2:
                        answer = (double) firstRandom / secondRandom;
                        System.out.println(answer);
                        break;
                    case 3:
                        answer = firstRandom * secondRandom;
                        System.out.println(answer);
                        break;
                    default:
                        System.out.println("If you see this, something went wrong");
                        break;
                }

                String userInput = input.next();
                if (userInput.equalsIgnoreCase("x")) {
                    userExit = true;
                    break;
                }

                try {
                    double userAnswer = Double.parseDouble(userInput);

                    if (Math.abs(answer - userAnswer) < ACCEPTABLE_ERROR) {
                        System.out.println("You got it right! Good human.");
                        score += 10;
                        System.out.println("Your score is: " + score + "\n");
                    } else {
                        System.out.println("You are not as efficient as a robot and will be terminated.");
                        score -= 10;
                        System.out.println("Your score is: " + score + "\n");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please type a valid number.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Please type a valid number.");
                input.next();
            }
        }
    }
}
