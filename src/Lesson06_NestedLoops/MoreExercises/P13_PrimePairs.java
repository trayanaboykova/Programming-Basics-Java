package Lesson06_NestedLoops.MoreExercises;

import java.util.Scanner;

public class P13_PrimePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstPair= Integer.parseInt(scanner.nextLine());
        int secondPair = Integer.parseInt(scanner.nextLine());
        int firstPairLimit = Integer.parseInt(scanner.nextLine());
        int secondPairLimit = Integer.parseInt(scanner.nextLine());

        for (int first = firstPair; first <= firstPair + firstPairLimit ; first++) {
            for (int second = secondPair; second <= secondPair + secondPairLimit ; second++) {
                double squareRoot1 = (int)Math.floor(Math.sqrt(first));
                double squareRoot2 = (int)Math.floor(Math.sqrt(second));

                boolean isPrime1 = true;
                boolean isPrime2 = true;

                if (first < 2) {
                    isPrime1 = false;
                }
                if (second < 2) {
                    isPrime2 = false;
                }

                for (int i = 2; i <= squareRoot1 ; i++) {
                    if (first % i ==0) {
                        isPrime1 = false;
                        break;
                    }
                }
                for (int i = 2; i <= squareRoot2 ; i++) {
                    if (second % i ==0) {
                        isPrime2 = false;
                        break;
                    }
                }
                if (isPrime1 && isPrime2) {
                    System.out.print(first);
                    System.out.println(second);
                }
            }
        }
    }
}
