package Module01_ProgrammingBasics.Course01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P01_TrapezoidArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        double area = (b1 + b2) * height / 2;
        System.out.printf("%.2f", area);
    }
}
