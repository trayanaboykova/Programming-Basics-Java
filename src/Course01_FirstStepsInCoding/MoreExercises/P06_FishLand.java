package Module01_ProgrammingBasics.Course01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P06_FishLand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mackerelPrice = Double.parseDouble(scanner.nextLine());
        double spratPrice = Double.parseDouble(scanner.nextLine());
        double bonitoKilos = Double.parseDouble(scanner.nextLine());
        double scadKilos = Double.parseDouble(scanner.nextLine());
        int clamsKilos = Integer.parseInt(scanner.nextLine());

        double bonitoPrice = mackerelPrice + mackerelPrice * 0.60;
        double scadPrice = spratPrice + spratPrice * 0.80;
        double clamsPrice = clamsKilos * 7.50;
        double bonito = bonitoKilos * bonitoPrice;
        double scad = scadKilos * scadPrice;
        double total = clamsPrice + bonito + scad;
        System.out.printf("%.02f", total);

    }
}
