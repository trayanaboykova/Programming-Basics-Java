package Lesson03_ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class P05_SmallShop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //второ решение от мен
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        if ("Sofia".equals(city)){
            if ("coffee".equals(product)){
                System.out.println(quantity * 0.50);
            } else if ("water".equals(product)) {
                System.out.println(quantity * 0.80);
            }else if ("beer".equals(product)) {
                System.out.println(quantity * 1.20);
            }else if ("sweets".equals(product)) {
                System.out.println(quantity * 1.45);
            }else {
                System.out.println(quantity * 1.60);
            }
        }
        if ("Plovdiv".equals(city)){
            if ("coffee".equals(product)){
                System.out.println(quantity * 0.40);
            } else if ("water".equals(product)) {
                System.out.println(quantity * 0.70);
            }else if ("beer".equals(product)) {
                System.out.println(quantity * 1.15);
            }else if ("sweets".equals(product)) {
                System.out.println(quantity * 1.30);
            }else {
                System.out.println(quantity * 1.50);
            }
        }
        if ("Varna".equals(city)){
            if ("coffee".equals(product)){
                System.out.println(quantity * 0.45);
            } else if ("water".equals(product)) {
                System.out.println(quantity * 0.70);
            }else if ("beer".equals(product)) {
                System.out.println(quantity * 1.10);
            }else if ("sweets".equals(product)) {
                System.out.println(quantity * 1.35);
            }else {
                System.out.println(quantity * 1.55);
            }
        }
    }
}
