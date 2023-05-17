package Module01_ProgrammingBasics.Course06_NestedLoops.Exercise;

import java.util.Scanner;

public class P01_NumberPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean flag = false;
        int number = Integer.parseInt(scanner.nextLine());
        int currentNumber = 0;
        for (int rows = 1; rows <= number; rows++) {

            for (int cols = 1; cols <= rows; cols++) {
                currentNumber++;
                if (currentNumber > number) {
                    flag = true;
                    break;
                }
                System.out.print(currentNumber + " ");
            }
            if (flag) {
                break;
            }
            System.out.println();
        }

    }

}

