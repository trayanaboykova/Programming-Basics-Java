package Course01_FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class P06_Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int workHours = Integer.parseInt(scanner.nextLine());

        int totalNylon = nylon + 2;
        double totalPaint = paint + (paint * 10 / 100.00);

        double priceNylon = totalNylon * 1.50;
        double pricePaint = totalPaint * 14.50;
        double priceThinner = thinner * 5.00;

        double priceMaterials = priceNylon + pricePaint + priceThinner + 0.40;

        double priceWorkers = (priceMaterials * 30 / 100) * workHours;

        double totalPrice = priceMaterials + priceWorkers;

        System.out.println(totalPrice);
    }
}
