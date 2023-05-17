package Course01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P07_HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double sideWall = x * y;
        double window = 1.5 * 1.5;
        double sides = 2 * sideWall - 2 * window;
        double backWall = x*x;
        double entrance = 1.2 * 2;
        double frontAndBack = 2 * backWall - entrance;
        double totalAreaWalls = sides + frontAndBack;
        double greenPaint = totalAreaWalls / 3.4;

        double roof = 2 * (x*y);
        double triangle = 2 * (x * h/2);
        double totalAreaRoof = roof + triangle;
        double redPaint = totalAreaRoof / 4.3;
        System.out.printf("%.02f%n", greenPaint);
        System.out.printf("%.02f%n", redPaint);


    }
}
