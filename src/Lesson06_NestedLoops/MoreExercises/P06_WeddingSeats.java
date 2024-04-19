package Lesson06_NestedLoops.MoreExercises;

import java.util.Scanner;

public class P06_WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char lastSector = scanner.nextLine().charAt(0);
        int firstSectorRows = Integer.parseInt(scanner.nextLine());
        int seatsOnOddRow = Integer.parseInt(scanner.nextLine());

        int totalSeats = 0;

        for (char sector = 'A'; sector <= lastSector; sector++) {
            for (int row = 1; row <= firstSectorRows; row++) {
                int seatsOnRow = (row % 2 == 1) ? seatsOnOddRow : seatsOnOddRow + 2;
                for (char seat = 'a'; seat < 'a' + seatsOnRow; seat++) {
                    System.out.printf("%c%d%c%n", sector, row, seat);
                    totalSeats++;
                }
            }
            firstSectorRows++;
        }

        System.out.println(totalSeats);
    }
}
