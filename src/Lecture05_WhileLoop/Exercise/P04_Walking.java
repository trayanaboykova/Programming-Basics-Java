package Lecture05_WhileLoop.Exercise;

import java.util.Scanner;

public class P04_Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goal = 10000;

        String input = scanner.nextLine();
        int reachedSteps = 0;
        while (!input.equals("Going home")) {
            int steps = Integer.parseInt(input);
            reachedSteps = reachedSteps + steps;
            if (reachedSteps >= goal) {
                break;
            }

            input = scanner.nextLine();
        }
        if (input.equals("Going home")) {
            int stepsToHome = Integer.parseInt(scanner.nextLine());
            reachedSteps = reachedSteps + stepsToHome;
        }

        if (reachedSteps >= goal) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", reachedSteps - goal);
        } else {
            System.out.printf("%d more steps to reach goal.", goal - reachedSteps);
        }


    }
}

