package Exams.ExamPreparation;

import java.util.Scanner;

public class P03_MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (destination){
            case "Dubai":
                if ("Winter".equals(season)){
                    price = 45000;
                } else if ("Summer".equals(season)) {
                    price = 40000;
                }
                price *= 0.70;
                break;
            case "Sofia":
                if ("Winter".equals(season)){
                    price = 17000;
                } else if ("Summer".equals(season)) {
                    price = 12500;
                }
                price *= 1.25;
                break;
            case "London":
                if ("Winter".equals(season)){
                    price = 24000;
                } else if ("Summer".equals(season)) {
                    price = 20250;
                }
                break;
        }
        double totalPrice = price * days;
        if (budget >= totalPrice){
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", budget - totalPrice);
        }else {
            System.out.printf("The director needs %.2f leva more!", totalPrice - budget);
        }


    }
}
