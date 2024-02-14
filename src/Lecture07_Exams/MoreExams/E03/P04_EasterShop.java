package Lecture07_Exams.MoreExams.E03;

import java.util.Scanner;

public class P04_EasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialEggs = Integer.parseInt(scanner.nextLine());
        int soldEggs = 0;

        while (true) {
            String command = scanner.nextLine();

            if (command.equals("Close")) {
                System.out.println("Store is closed!");
                System.out.printf("%d eggs sold.%n", soldEggs);
                break;
            }

            int eggsCount = Integer.parseInt(scanner.nextLine());

            if (command.equals("Buy")) {
                if (eggsCount <= initialEggs) {
                    initialEggs -= eggsCount;
                    soldEggs += eggsCount;
                } else {
                    System.out.println("Not enough eggs in store!");
                    System.out.printf("You can buy only %d.%n", initialEggs);
                    break;
                }
            } else if (command.equals("Fill")) {
                initialEggs += eggsCount;
            }
        }
    }
}
