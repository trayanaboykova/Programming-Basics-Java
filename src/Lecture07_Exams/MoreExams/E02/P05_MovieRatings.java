package Lecture07_Exams.MoreExams.E02;

import java.util.Scanner;

public class P05_MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String highestRatedMovie = "";
        double highestRating = Double.MIN_VALUE;
        String lowestRatedMovie = "";
        double lowestRating = Double.MAX_VALUE;
        double totalRating = 0;

        for (int i = 0; i < n; i++) {
            String movie = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());

            totalRating += rating;

            if (rating > highestRating) {
                highestRating = rating;
                highestRatedMovie = movie;
            }

            if (rating < lowestRating) {
                lowestRating = rating;
                lowestRatedMovie = movie;
            }
        }

        double averageRating = totalRating / n;

        System.out.printf("%s is with highest rating: %.1f%n", highestRatedMovie, highestRating);
        System.out.printf("%s is with lowest rating: %.1f%n", lowestRatedMovie, lowestRating);
        System.out.printf("Average rating: %.1f", averageRating);
    }
}
