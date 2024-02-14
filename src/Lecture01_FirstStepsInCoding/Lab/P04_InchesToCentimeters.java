package Lecture01_FirstStepsInCoding.Lab;

import java.util.Scanner;

public class P04_InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитане на вход
        double inches = Double.parseDouble(scanner.nextLine());
        // Пресмятане
        // 1 инч = 2,54 см
        double centimeters = inches * 2.54;
        // Печатане на резултат
        System.out.println(centimeters);
    }
}
