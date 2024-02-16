package Lesson07_Exams.MoreExams.E07;

import java.util.Scanner;

public class P04_TrekkingMania {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int groups = Integer.parseInt(scanner.nextLine());
        int musala = 0, monblan = 0, kilimanjaro = 0,
                k2 = 0, everest = 0;
        double musalaPercent = 0, monblanPercent = 0, kilimanjaroPercent = 0,
                k2Percent = 0, everestPercent = 0,totalPeople = 0;

        for(int i = 0; i < groups; i++) {

            int peopleInGroup = Integer.parseInt(scanner.nextLine());
            totalPeople += peopleInGroup;

            if (peopleInGroup <= 5){
                musala += peopleInGroup;
            } else if (peopleInGroup > 5 && peopleInGroup <= 12) {
                monblan += peopleInGroup;
            } else if (peopleInGroup > 12 && peopleInGroup <= 25) {
                kilimanjaro += peopleInGroup;
            } else if (peopleInGroup > 25 && peopleInGroup <= 40) {
                k2 += peopleInGroup;
            } else {
                everest += peopleInGroup;
            }
        }

        musalaPercent = (musala / totalPeople) * 100;
        monblanPercent = (monblan / totalPeople) * 100;
        kilimanjaroPercent = (kilimanjaro / totalPeople) * 100;
        k2Percent = (k2 / totalPeople) * 100;
        everestPercent = (everest / totalPeople) * 100;

        System.out.printf("%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n",
                musalaPercent, monblanPercent, kilimanjaroPercent, k2Percent, everestPercent);

    }
}
