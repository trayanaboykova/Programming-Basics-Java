package Course01_FirstStepsInCoding.Lab;

import java.util.Scanner;

public class P08_PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogsPackages = Integer.parseInt(scanner.nextLine());
        int catsPackages = Integer.parseInt(scanner.nextLine());

        // храна за кучета е на цена 2,50 лв.
        double dogsTotalPrice = dogsPackages * 2.50;
        // храна за котки е на цена 4 лв.
        double catsTotalPrice = catsPackages * 4;
        // Всичко разходи
        double totalExpenses = dogsTotalPrice + catsTotalPrice;

        System.out.printf("%f lv.", totalExpenses);

    }
}
