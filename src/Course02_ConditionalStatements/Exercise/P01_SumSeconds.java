package Module01_ProgrammingBasics.Course02_ConditionalStatements.Exercise;

import java.util.Scanner;

public class P01_SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int sumSec = first + second + third;
        int min = sumSec / 60;
        int sec = sumSec % 60;

       // System.out.printf("%d:%02d", min, sec)
        // System.out.println (min + ":0" + sec);
        if (sec <= 9) {
            System.out.printf("%d:0%d%n", min, sec);

        } else {
            System.out.printf("%d:%d", min, sec);
        }


    }
}
