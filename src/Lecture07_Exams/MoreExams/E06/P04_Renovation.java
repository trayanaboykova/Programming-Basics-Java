package Lecture07_Exams.MoreExams.E06;

import java.util.Scanner;

public class P04_Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        double percent = Integer.parseInt(scanner.nextLine()) / 100.00;
        double areaToPaint = ((height * width) * 4);
        areaToPaint -= (areaToPaint * percent);
        double currentPaintedArea = 0;
        boolean isPainted = false;
        String input = scanner.nextLine();

        while (!input.equals("Tired!")) {
            int paint = Integer.parseInt(input);
            currentPaintedArea += paint;

            if (currentPaintedArea > areaToPaint) {
                isPainted = true;
                break;
            } else if (currentPaintedArea == areaToPaint){
                break;
            }

            input = scanner.nextLine();

        }

        if (isPainted) {
            System.out.printf("All walls are painted and you have %d l paint left!",
                    Math.round(currentPaintedArea - areaToPaint));
        } else if (areaToPaint == currentPaintedArea) {
            System.out.println("All walls are painted! Great job, Pesho!");
        } else {
            System.out.printf("%d quadratic m left.", Math.round(areaToPaint - currentPaintedArea));
        }
    }
}
