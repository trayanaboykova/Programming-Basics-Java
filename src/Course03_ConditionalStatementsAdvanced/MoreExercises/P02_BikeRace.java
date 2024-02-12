package Course03_ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class P02_BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniorParticipants = Integer.parseInt(scanner.nextLine());
        int seniorParticipants = Integer.parseInt(scanner.nextLine());
        String trackType = scanner.nextLine();

        double juniorFee = 0;
        double seniorFee = 0;

        switch (trackType) {
            case "trail":
                juniorFee = 5.50;
                seniorFee = 7;
                break;
            case "cross-country":
                juniorFee = 8;
                seniorFee = 9.50;
                break;
            case "downhill":
                juniorFee = 12.25;
                seniorFee = 13.75;
                break;
            case "road":
                juniorFee = 20;
                seniorFee = 21.50;
                break;
        }

        int totalParticipants = juniorParticipants + seniorParticipants;
        double totalFee = (juniorParticipants * juniorFee) + (seniorParticipants * seniorFee);

        if (trackType.equals("cross-country") && totalParticipants >= 50) {
            totalFee *= 0.75; // 25% discount
        }

        totalFee *= 0.95; // 5% for expenses

        System.out.printf("%.2f", totalFee);
    }
}
