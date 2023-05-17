package Exams.RegularExam;

import java.util.Scanner;

public class P02_Spaceship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double average = Double.parseDouble(scanner.nextLine());

        double volume = width * length * height;
        double room = (average + 0.40) * 2 * 2;
        double astronautsCount = volume / room;
        if (astronautsCount >= 3 && astronautsCount <= 10){
            System.out.printf("The spacecraft holds %.0f astronauts.", Math.floor(astronautsCount));
        } else if (astronautsCount < 3) {
            System.out.println("The spacecraft is too small.");
        }else {
            System.out.println("The spacecraft is too big.");
        }

    }
}
