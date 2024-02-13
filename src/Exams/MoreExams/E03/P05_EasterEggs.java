package Exams.MoreExams.E03;

import java.util.Scanner;

public class P05_EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsCount = Integer.parseInt(scanner.nextLine());

        int redCount = 0;
        int orangeCount = 0;
        int blueCount = 0;
        int greenCount = 0;

        for (int i = 0; i < eggsCount; i++) {
            String color = scanner.nextLine();

            switch (color) {
                case "red":
                    redCount++;
                    break;
                case "orange":
                    orangeCount++;
                    break;
                case "blue":
                    blueCount++;
                    break;
                case "green":
                    greenCount++;
                    break;
            }
        }

        System.out.println("Red eggs: " + redCount);
        System.out.println("Orange eggs: " + orangeCount);
        System.out.println("Blue eggs: " + blueCount);
        System.out.println("Green eggs: " + greenCount);

        int maxCount = Math.max(redCount, Math.max(orangeCount, Math.max(blueCount, greenCount)));
        String maxColor = "";
        if (maxCount == redCount) {
            maxColor = "red";
        } else if (maxCount == orangeCount) {
            maxColor = "orange";
        } else if (maxCount == blueCount) {
            maxColor = "blue";
        } else {
            maxColor = "green";
        }

        System.out.println("Max eggs: " + maxCount + " -> " + maxColor);
    }
}
