package Lesson04_ForLoop.MoreExercises;

import java.util.Scanner;

public class P11_OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double oddSum = 0, evenSum = 0;
        double oddMin = Double.POSITIVE_INFINITY, oddMax = Double.NEGATIVE_INFINITY;
        double evenMin = Double.POSITIVE_INFINITY, evenMax = Double.NEGATIVE_INFINITY;

        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(scanner.nextLine());

            if (i % 2 != 0) {
                oddSum += num;
                if (num < oddMin) {
                    oddMin = num;
                }
                if (num > oddMax) {
                    oddMax = num;
                }
            } else { // Even position
                evenSum += num;
                if (num < evenMin) {
                    evenMin = num;
                }
                if (num > evenMax) {
                    evenMax = num;
                }
            }
        }

        System.out.println("OddSum=" + String.format("%.2f", oddSum) + ",");
        System.out.println("OddMin=" + (oddMin == Double.POSITIVE_INFINITY ? "No" : String.format("%.2f", oddMin)) + ",");
        System.out.println("OddMax=" + (oddMax == Double.NEGATIVE_INFINITY ? "No" : String.format("%.2f", oddMax)) + ",");
        System.out.println("EvenSum=" + String.format("%.2f", evenSum) + ",");
        System.out.println("EvenMin=" + (evenMin == Double.POSITIVE_INFINITY ? "No" : String.format("%.2f", evenMin)) + ",");
        System.out.println("EvenMax=" + (evenMax == Double.NEGATIVE_INFINITY ? "No" : String.format("%.2f", evenMax)));

    }
}
