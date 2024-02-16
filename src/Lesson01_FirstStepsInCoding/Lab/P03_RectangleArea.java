package Lesson01_FirstStepsInCoding.Lab;

import java.util.Scanner;

public class P03_RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Прочитане на входни данни
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        //Пресмятане
        int area = a * b;
        //Принтиране на резултата
        System.out.println(area);

}

}