package Lesson01_FirstStepsInCoding.Lab;

import java.util.Scanner;

public class P06_ConcatenateData {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String firstName = scan.nextLine();
        String lastName = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        String town = scan.nextLine();

        System.out.print("You are " + firstName + " " + lastName + ", a "+ age + "-years old person from " + town + ".");
    }
}
