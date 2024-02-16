package Lesson01_FirstStepsInCoding.Lab;

import java.util.Scanner;

public class P09_YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        // Прочитане на вход
        double area = Double.parseDouble(scanner.nextLine());
        //Изчисления
        // Цената на един кв. м. е 7.61 лв. със ДДС.
        double priceWithoutDiscount = area * 7.61;
        // 18% отстъпка от крайната цена.
        double discount = priceWithoutDiscount * 0.18;
        // Цената с извадена отстъпка
        double priceWithDiscount = priceWithoutDiscount - discount;
        // Принтиране на резултата
        System.out.printf("The final price is: %f lv.%n", priceWithDiscount);
        System.out.printf("The discount is %f lv.", discount);

    }
}
