package Lesson06_NestedLoops.MoreExercises;

import java.util.Scanner;

public class P02_LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);
        char exclude = scanner.nextLine().charAt(0);
        int count = 0;
        StringBuilder output = new StringBuilder();

        for (char i = start; i <= end; i++) {
            if (i == exclude) continue;
            for (char j = start; j <= end; j++) {
                if (j == exclude) continue;
                for (char k = start; k <= end; k++) {
                    if (k == exclude) continue;
                    output.append(i).append(j).append(k).append(" ");
                    count++;
                }
            }
        }

        output.append(count);
        System.out.println(output.toString());
        scanner.close();
    }
}
