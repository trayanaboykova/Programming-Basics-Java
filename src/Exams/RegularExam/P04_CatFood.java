package Exams.RegularExam;

import java.util.Scanner;

public class P04_CatFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cats = Integer.parseInt(scanner.nextLine());
        int smallCats = 0;
        int averageCats = 0;
        int bigCats = 0;
        double priceFood = 12.45;
        double gramsPerDay = 0;

        for (int i = 0; i < cats; i++) {
            double eatenFood = Double.parseDouble(scanner.nextLine());
            gramsPerDay = gramsPerDay + eatenFood;
            if (eatenFood >= 100 && eatenFood < 200){
                smallCats++;
            } else if (eatenFood >= 200 && eatenFood < 300) {
                averageCats++;
            } else if (eatenFood >= 300 && eatenFood < 400) {
                bigCats++;
            }
        }
        double total = (gramsPerDay / 1000) * priceFood;
        System.out.printf("Group 1: %d cats.%n", smallCats);
        System.out.printf("Group 2: %d cats.%n", averageCats);
        System.out.printf("Group 3: %d cats.%n", bigCats);
        System.out.printf("Price for food per day: %.02f lv.", total);

    }
}
