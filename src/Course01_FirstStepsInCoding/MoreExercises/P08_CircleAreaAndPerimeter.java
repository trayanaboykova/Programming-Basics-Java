package Module01_ProgrammingBasics.Course01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P08_CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radians = Double.parseDouble(scanner.nextLine());

        double perimeter = 2 * Math.PI * radians;
        double area = Math.PI * radians * radians;
        System.out.printf("%.2f%n", area);
        System.out.printf("%.2f", perimeter);
    }
}
