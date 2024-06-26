package Lesson06_NestedLoops.MoreExercises;

import java.util.Scanner;

public class P10_Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oneLev = Integer.parseInt(scanner.nextLine());
        int twoLev = Integer.parseInt(scanner.nextLine());
        int fiveLev = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= oneLev; i++) {
            for (int j = 0; j <= twoLev; j++) {
                for (int k = 0; k <= fiveLev; k++) {
                    if (i * 1 + j * 2 + k * 5 == sum){
                        System.out.println(i + " * 1 lv. + " + j +" * 2 lv. + " + k +" * 5 lv. = " + sum + " lv.");
                    }
                }
            }
        }
    }
}
