package Lesson05_WhileLoop.MoreExercises;

import java.util.Scanner;

public class P03_StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder currentWord = new StringBuilder();
        StringBuilder result = new StringBuilder();

        boolean foundC = false, foundO = false, foundN = false;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }

            char ch = input.charAt(0);
            if (!Character.isLetter(ch)) {
                continue;
            }

            if (ch == 'c' || ch == 'o' || ch == 'n') {
                if (ch == 'c' && !foundC) {
                    foundC = true;
                } else if (ch == 'o' && !foundO) {
                    foundO = true;
                } else if (ch == 'n' && !foundN) {
                    foundN = true;
                } else {
                    currentWord.append(ch);
                }

                if (foundC && foundO && foundN) {
                    result.append(currentWord).append(" ");
                    currentWord.setLength(0);
                    foundC = foundO = foundN = false;
                }
            } else {
                currentWord.append(ch);
            }
        }

        System.out.println(result.toString().trim());
    }
}
