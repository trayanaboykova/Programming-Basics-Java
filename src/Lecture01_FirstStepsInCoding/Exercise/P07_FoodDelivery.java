package Lecture01_FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class P07_FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegetarianMenu = Integer.parseInt(scanner.nextLine());

        double chickenMenuPrice = chickenMenu * 10.35;
        double fishMenuPrice = fishMenu * 12.40;
        double vegetarianMenuPrice = vegetarianMenu * 8.15;
        double totalMenusPrice = chickenMenuPrice + fishMenuPrice + vegetarianMenuPrice;
        double desertPrice = totalMenusPrice * 20 / 100;
        double totalPrice = chickenMenuPrice + fishMenuPrice + vegetarianMenuPrice + desertPrice + 2.50;

        System.out.println(totalPrice);
    }
}
