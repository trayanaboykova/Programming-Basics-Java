package Lecture07_Exams.MoreExams.E05;

import java.util.Scanner;

public class P06_FavoriteMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bestMovieTitle = "";
        int bestMovieScore = Integer.MIN_VALUE;
        int moviesCount = 0;

        while (scanner.hasNextLine()) {
            String movieTitle = scanner.nextLine();

            if (movieTitle.equals("STOP")) {
                break;
            }

            int score = 0;
            int length = movieTitle.length();

            for (int i = 0; i < length; i++) {
                char c = movieTitle.charAt(i);
                if (Character.isUpperCase(c)) {
                    score += (int) c - length;
                } else if (Character.isLowerCase(c)) {
                    score += (int) c - (2 * length);
                } else {
                    score += (int) c;
                }
            }

            if (score > bestMovieScore) {
                bestMovieTitle = movieTitle;
                bestMovieScore = score;
            }

            moviesCount++;
            if (moviesCount == 7) {
                System.out.println("The limit is reached.");
                break;
            }
        }

        System.out.printf("The best movie for you is %s with %d ASCII sum.", bestMovieTitle, bestMovieScore);
    }
}
