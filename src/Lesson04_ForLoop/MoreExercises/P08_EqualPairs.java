package Lesson04_ForLoop.MoreExercises;

import java.util.Scanner;

public class P08_EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int previousPairSum = 0;
        int currentPairSum = 0;
        boolean isEqual = true;
        int maxDiff = 0;

        if (n > 0) {
            int firstNum = Integer.parseInt(scanner.nextLine());
            int secondNum = Integer.parseInt(scanner.nextLine());
            previousPairSum = firstNum + secondNum;
        }

        for (int i = 1; i < n; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());
            currentPairSum = num1 + num2;

            if (currentPairSum != previousPairSum) {
                isEqual = false;
                int currentDiff = Math.abs(currentPairSum - previousPairSum);
                if (currentDiff > maxDiff) {
                    maxDiff = currentDiff;
                }
            }

            previousPairSum = currentPairSum;
        }

        if (isEqual) {
            System.out.println("Yes, value=" + previousPairSum);
        } else {
            System.out.println("No, maxdiff=" + maxDiff);
        }

    }
}
