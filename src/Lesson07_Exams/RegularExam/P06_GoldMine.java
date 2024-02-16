package Lesson07_Exams.RegularExam;

import java.util.Scanner;

public class P06_GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int locations = Integer.parseInt(scanner.nextLine());

        double totalGold = 0;


        for (int i = 0; i < locations ; i++) {
            double averageGold = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            for (int j = 0; j < days ; j++) {
                double goldPerDay = Double.parseDouble(scanner.nextLine());
                for (int k = 0; k < goldPerDay; k++) {
                    goldPerDay++;
                    totalGold = totalGold + goldPerDay;
                    double average = totalGold / days;
                    if (average > averageGold){
                        System.out.printf("Good job! Average gold per day: %.02f.",average);
                        break;
                    }else {
                        System.out.printf("You need %.02f gold.", averageGold - average);
                    }
                }

            }
        }

    }
}
