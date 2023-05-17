package Module01_ProgrammingBasics.Course03_ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int countNight = Integer.parseInt(scanner.nextLine());

        double priceStudio;
        double priceApartment;

        if (month.equals("May") || month.equals("October")) {
            priceStudio = 50;
            priceApartment = 65;
            if (countNight > 7 && countNight <= 14) {
                priceStudio = priceStudio - priceStudio * 0.05;
            }else if(countNight > 14){
                priceStudio = priceStudio - priceStudio * 0.30;
                priceApartment = priceApartment - priceApartment * 0.10;
            }
        } else if (month.equals("June") || month.equals("September")) {
            priceStudio = 75.20;
            priceApartment = 68.70;

            if(countNight > 14){
                priceApartment = priceApartment - priceApartment * 0.10;
                priceStudio = priceStudio - priceStudio * 0.20;
            }
        } else {
            priceStudio = 76;
            priceApartment = 77;
            if(countNight > 14){
                priceApartment = priceApartment - priceApartment * 0.10;
            }
        }
        System.out.printf("Apartment: %.2f lv.\n", priceApartment * countNight);
        System.out.printf("Studio: %.2f lv.", priceStudio * countNight );

    }
}
