package Course01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P03_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double degreesCelsius = Double.parseDouble(scanner.nextLine());
        //T (° F) = T (° C) × 1,8 + 32
        double degreesFahrenheit = degreesCelsius * 1.8 + 32;
        System.out.printf("%.2f", degreesFahrenheit);
    }
}
