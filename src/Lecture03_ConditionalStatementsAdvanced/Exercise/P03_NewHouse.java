package Lecture03_ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class P03_NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double priceRoses = 5;
        double priceDahlias = 3.80;
        double priceTulips = 2.80;
        double priceNarcissus = 3;
        double priceGladiolus = 2.50;

        double price = 0;
        switch (type) {
            case "Roses":
                price = priceRoses * count;
                break;
            case "Dahlias":
                price = priceDahlias * count;
                break;
            case "Tulips":
                price = priceTulips * count;
                break;
            case "Narcissus":
                price = priceNarcissus * count;
                break;
            case "Gladiolus":
                price = priceGladiolus * count;
                break;
        }

        if(type.equals("Roses") && count > 80){
            price = price - price * 0.10;

        }else if (type.equals("Dahlias") && count > 90){
            price = price - price * 0.15;

        }else if(type.equals("Tulips") && count > 80){
            price = price - price * 0.15;

        }else if(type.equals("Narcissus") && count < 120){
            price = price + price * 0.15;

        }else if(type.equals("Gladiolus") && count < 80){
            price = price + price * 0.20;
        }

        if(price <= budget){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left."
                    , count, type, budget - price );
        }else{
            System.out.printf("Not enough money, you need %.2f leva more.",  price - budget);
        }
    }
}
