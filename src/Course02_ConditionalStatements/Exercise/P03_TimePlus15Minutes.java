package Course02_ConditionalStatements.Exercise;

import java.util.Scanner;

public class P03_TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int totalMin = hour * 60 + min + 15;
        int newHour = totalMin / 60;
        int newMin = totalMin % 60;

        if (newHour == 24){
            newHour = 0;
        }
        System.out.printf("%d:%02d", newHour, newMin);
    }
}

