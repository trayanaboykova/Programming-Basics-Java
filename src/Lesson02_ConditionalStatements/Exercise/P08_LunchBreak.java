package Lesson02_ConditionalStatements.Exercise;

import java.util.Scanner;

public class P08_LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tvShow = scanner.nextLine();
        int tvShowTime = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());

        double lunchTime = breakTime / 8.00;
        // breakTime * 0.125;
        double relaxTime = breakTime / 4.00;
        // breakTime * 0.25;

        double timeLeft = breakTime - (lunchTime + relaxTime);

        if(timeLeft >= tvShowTime){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", tvShow, Math.ceil(timeLeft - tvShowTime));
        }else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", tvShow, Math.ceil(tvShowTime - timeLeft));
        }
















    }
}
