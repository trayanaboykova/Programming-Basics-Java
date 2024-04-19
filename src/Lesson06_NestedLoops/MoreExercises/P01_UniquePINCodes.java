package Lesson06_NestedLoops.MoreExercises;

import java.util.Scanner;

public class P01_UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int upperLimit1 = Integer.parseInt(scanner.nextLine());
        int upperLimit2 = Integer.parseInt(scanner.nextLine());
        int upperLimit3 = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= upperLimit1; i += 2) {
            for (int j = 2; j <= upperLimit2; j++) {
                if (isPrime(j) && j <= 7) {
                    for (int k = 2; k <= upperLimit3; k += 2) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
    }
    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
