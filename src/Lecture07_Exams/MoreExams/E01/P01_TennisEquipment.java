package Lecture07_Exams.MoreExams.E01;

import java.util.Scanner;

public class P01_TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double racketPrice = Double.parseDouble(scanner.nextLine());
        int racketCount = Integer.parseInt(scanner.nextLine());
        int shoesCount = Integer.parseInt(scanner.nextLine());

        double shoesPrice = racketPrice / 6;
        double totalRacketPrice = racketPrice * racketCount;
        double totalShoesPrice = shoesPrice * shoesCount;
        double otherEquipmentPrice = (totalRacketPrice + totalShoesPrice) * 0.2;
        double totalPrice = totalRacketPrice + totalShoesPrice + otherEquipmentPrice;

        int djokovicPrice = (int) Math.floor(totalPrice / 8);
        int sponsorsPrice = (int) Math.ceil(totalPrice * 7 / 8);

        System.out.println("Price to be paid by Djokovic " + djokovicPrice);
        System.out.println("Price to be paid by sponsors " + sponsorsPrice);
    }
}
