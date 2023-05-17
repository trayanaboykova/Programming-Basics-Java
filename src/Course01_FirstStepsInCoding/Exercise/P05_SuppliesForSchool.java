package Module01_ProgrammingBasics.Course01_FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class P05_SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int cleaner = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double pensPrice = pens * 5.80;
        double markersPrice = markers * 7.20;
        double cleanerPrice = cleaner * 1.20;

        double totalPrice = pensPrice + markersPrice + cleanerPrice;
        double totalPriceAfterDiscount = totalPrice - (totalPrice * discount / 100);

        System.out.println(totalPriceAfterDiscount);
    }
}
