package Lesson07_Exams.MoreExams.E05;

import java.util.Scanner;

public class P01_SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String seriesName = scanner.nextLine();
        int seasons = Integer.parseInt(scanner.nextLine());
        int episodesPerSeason = Integer.parseInt(scanner.nextLine());
        double episodeDuration = Double.parseDouble(scanner.nextLine());

        double totalDuration = 0;

        for (int season = 1; season <= seasons; season++) {
            for (int episode = 1; episode <= episodesPerSeason; episode++) {
                double episodeWithAds = episodeDuration * 1.2; // 20% longer due to ads
                if (episode == episodesPerSeason) // Special episode at the end of each season
                    episodeWithAds += 10;
                totalDuration += episodeWithAds;
            }
        }

        System.out.printf("Total time needed to watch the %s series is %d minutes.", seriesName, Math.round(totalDuration));
    }
}
