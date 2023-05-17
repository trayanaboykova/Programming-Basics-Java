package Course03_ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class P01_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        int all = rows * cols;

        double price;
        switch (type) {

            case "Premiere":
                price = 12;
                System.out.printf("%.2f leva", price * all);
                break;
            case "Normal":
                price = 7.50;
                System.out.printf("%.2f leva", price * all);
                break;
            case "Discount":
                price = 5;
                System.out.printf("%.2f leva", price * all);
                break;
        }
    }
}
