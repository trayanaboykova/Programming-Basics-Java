package Lecture07_Exams.MoreExams.E06;

import java.util.Scanner;

public class P06_TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mostPowerfulWord = "";
        int maxPower = Integer.MIN_VALUE;

        while (true) {
            String word = scanner.nextLine();
            if (word.equals("End of words")) {
                break;
            }

            int sum = 0;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                sum += ch;
            }

            int power;
            if ("aeiouyAEIOUY".indexOf(word.charAt(0)) != -1) {
                power = sum * word.length();
            } else {
                power = sum / word.length();
            }

            if (power > maxPower) {
                maxPower = power;
                mostPowerfulWord = word;
            }
        }

        System.out.printf("The most powerful word is %s - %d%n", mostPowerfulWord, maxPower);
    }
}
