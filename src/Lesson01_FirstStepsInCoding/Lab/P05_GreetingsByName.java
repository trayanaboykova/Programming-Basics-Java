package Lesson01_FirstStepsInCoding.Lab;

import java.util.Scanner;

public class P05_GreetingsByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Прочитане на вход
        String name = scanner.nextLine();

        // Принтиране на резултат
        System.out.println("Hello, " + name + "!");
    }
}
