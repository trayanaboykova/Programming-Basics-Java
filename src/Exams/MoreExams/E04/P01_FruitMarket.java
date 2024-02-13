package Exams.MoreExams.E04;

import java.util.Scanner;

public class P01_FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double strawberriesPrice = Double.parseDouble(scanner.nextLine());
        double bananasQuantity = Double.parseDouble(scanner.nextLine());
        double orangesQuantity = Double.parseDouble(scanner.nextLine());
        double raspberriesQuantity = Double.parseDouble(scanner.nextLine());
        double strawberriesQuantity = Double.parseDouble(scanner.nextLine());

        double raspberriesPrice = strawberriesPrice / 2;
        double orangesPrice = raspberriesPrice * 0.60;
        double bananasPrice = raspberriesPrice * 0.20;

        double totalPrice = strawberriesPrice * strawberriesQuantity +
                raspberriesPrice * raspberriesQuantity +
                orangesPrice * orangesQuantity +
                bananasPrice * bananasQuantity;

        System.out.printf("%.2f", totalPrice);
    }
}
