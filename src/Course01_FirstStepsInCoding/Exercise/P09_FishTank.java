package Course01_FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class P09_FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int volumeCm = length * width * height;
        double volumeDc = volumeCm / 1000.00;

        double needWater = volumeDc * (1 - percent/100);

        System.out.println(needWater);
    }
}
