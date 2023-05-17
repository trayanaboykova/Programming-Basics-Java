package Module01_ProgrammingBasics.Course03_ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class P07_WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        if (hour >= 10 && hour <= 18){
            switch (day){
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                case "Saturday":
                    System.out.println("open");
                    break;
                case "Sunday":
                    System.out.println("closed");
                    break;
            }
        } else
            System.out.println("closed");
    }
}
