package Module01_ProgrammingBasics.Course01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P04_VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceKiloVegetables = Double.parseDouble(scanner.nextLine());
        double priceKiloFruits = Double.parseDouble(scanner.nextLine());
        int totalKilosVegetables = Integer.parseInt(scanner.nextLine());
        int totalKilosFruits = Integer.parseInt(scanner.nextLine());

        double totalVegetables = priceKiloVegetables * totalKilosVegetables;
        double totalFruits = priceKiloFruits * totalKilosFruits;
        double total = totalVegetables + totalFruits;
        double totalEuro = total / 1.94;
        System.out.printf("%.02f", totalEuro);
    }
}
