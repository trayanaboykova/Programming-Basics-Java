package Lesson06_NestedLoops.MoreExercises;

import java.util.Scanner;

public class P08_SecretDoorsLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= a ; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j <= b; j++) {
                    if (j == 2 || j == 3 || j == 5 || j == 7) {
                        for (int k = 1; k <= c; k++){
                            if (k % 2 == 0) {
                                System.out.println(i + " " + j + " " + k);
                            }
                        }
                    }
                }
            }
        }
    }
}
