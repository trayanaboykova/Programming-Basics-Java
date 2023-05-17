package Module01_ProgrammingBasics.Course01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P05_TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());

        width -= 1;
        double widthDesks = Math.floor(width / 0.7);
        double lengthDesks = Math.floor(length / 1.2);
        double freeSpace = (widthDesks * lengthDesks) - 3;
        System.out.printf("%.0f", freeSpace);

    }
}
