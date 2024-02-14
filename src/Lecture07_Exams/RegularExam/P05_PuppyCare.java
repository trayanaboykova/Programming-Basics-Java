package Lecture07_Exams.RegularExam;

import java.util.Scanner;

public class P05_PuppyCare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodKilogram = Integer.parseInt(scanner.nextLine());
        int foodGrams = foodKilogram * 1000;
        int eatenFood = 0;

        while (eatenFood >= 0){
            String input = scanner.nextLine();
            if (input.equals("Adopted")){
                break;
            }
            int foodPerDay = Integer.parseInt(input);
            eatenFood = eatenFood + foodPerDay;
        }
        if (foodGrams >= eatenFood){
            System.out.printf("Food is enough! Leftovers: %d grams.", Math.abs(foodGrams - eatenFood));
        }else {
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(eatenFood - foodGrams));
        }
    }
}
