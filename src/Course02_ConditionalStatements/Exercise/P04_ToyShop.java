package Course02_ConditionalStatements.Exercise;

import java.util.Scanner;

public class P04_ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tourPrice = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int doll = Integer.parseInt(scanner.nextLine());
        int bear = Integer.parseInt(scanner.nextLine());
        int minion = Integer.parseInt(scanner.nextLine());
        int truck = Integer.parseInt(scanner.nextLine());

        //•	Пъзел - 2.60 лв.
        //•	Говореща кукла - 3 лв.
        //•	Плюшено мече - 4.10 лв.
        //•	Миньон - 8.20 лв.
        //•	Камионче - 2 лв.

        double total = (puzzle * 2.60) + (doll * 3.00) + (bear * 4.10) + (minion * 8.20) + (truck * 2.00);
        int countToys = puzzle + doll + bear + minion + truck;

        if(countToys >= 50){
            total = total - (total * 0.25);
        }
        total = total - (total * 0.10);

        if(total >= tourPrice){
            System.out.printf("Yes! %.2f lv left.", total - tourPrice);
        }else{
            System.out.printf("Not enough money! %.2f lv needed.", tourPrice - total);
        }



    }
}
