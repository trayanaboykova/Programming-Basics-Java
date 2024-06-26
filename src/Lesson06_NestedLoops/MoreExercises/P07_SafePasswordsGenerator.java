package Lesson06_NestedLoops.MoreExercises;

import java.util.Scanner;

public class P07_SafePasswordsGenerator {
    public static void main(String[] args) {

        final int A_MIN_ASCII = 35;
        final int A_MAX_ASCII = 55;
        final int B_MIN_ASCII = 64;
        final int B_MAX_ASCII = 96;
        final String PASS_SEP = "|";

        Scanner scanner = new Scanner(System.in);
        int xMaxValue = Integer.parseInt(scanner.nextLine());
        int yMaxValue = Integer.parseInt(scanner.nextLine());
        int numPasswords = Integer.parseInt(scanner.nextLine());

        int numPassGenerated = 0;
        int passTemplate_A_ASCII = A_MIN_ASCII;
        int passTemplate_B_ASCII = B_MIN_ASCII;
        int passTemplate_x_Value = 1;

        for (int x = 1; x <= xMaxValue; x++) {
            if (numPassGenerated == numPasswords) {
                break;
            }
            for (int passTemplate_y_Value = 1; passTemplate_y_Value <= yMaxValue; passTemplate_y_Value++) {

                if (passTemplate_A_ASCII > A_MAX_ASCII) {
                    passTemplate_A_ASCII = A_MIN_ASCII;
                }
                char passTemplate_A = (char) passTemplate_A_ASCII;
                if (passTemplate_B_ASCII > B_MAX_ASCII) {
                    passTemplate_B_ASCII = B_MIN_ASCII;
                }
                char passTemplate_B = (char) passTemplate_B_ASCII;
                passTemplate_x_Value = x;

                String curPassword = "" + passTemplate_A + passTemplate_B + passTemplate_x_Value + passTemplate_y_Value + passTemplate_B + passTemplate_A + PASS_SEP;
                System.out.print(curPassword);

                passTemplate_A_ASCII++;
                passTemplate_B_ASCII++;
                numPassGenerated++;
                if (numPassGenerated == numPasswords) {
                    break;
                }
            }
        }
    }
}
