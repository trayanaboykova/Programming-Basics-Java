package Lesson07_Exams.ExamPreparation;

import java.util.Scanner;

public class P05_EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstPlayerEggs = Integer.parseInt(scanner.nextLine());
        int secondPlayerEggs = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        boolean isSecondWin = false;
        boolean isFirstWin = false;
        while (!command.equals("End")){
            switch (command){
                case "one":
                    secondPlayerEggs--;
                    break;
                case "two":
                    firstPlayerEggs--;
                    break;
            }
            if (firstPlayerEggs == 0){
                isSecondWin = true;
                break;
            }
            if (secondPlayerEggs == 0){
                isFirstWin = true;
                break;
            }
            command = scanner.nextLine();
        }
        if (isSecondWin){
            System.out.printf("Player one is out of eggs. Player two has %d eggs left.", secondPlayerEggs);
        } else if (isFirstWin) {
            System.out.printf("Player two is out of eggs. Player one has %d eggs left.", firstPlayerEggs);
        } else  {
            System.out.printf("Player one has %d eggs left.%n", firstPlayerEggs);
            System.out.printf("Player two has %d eggs left.", secondPlayerEggs);
        }
    }
}
