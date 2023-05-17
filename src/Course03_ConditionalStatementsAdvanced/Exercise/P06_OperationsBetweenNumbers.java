package Course03_ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class P06_OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        double result;

        switch (operator) {
            case "+":
                result = n1 + n2;
                System.out.printf("%d + %d = %.0f", n1, n2, result);
                if (result % 2 == 0) {
                    System.out.println(" - even");
                } else {
                    System.out.println(" - odd");
                }
                break;
            case "-":
                result = n1 - n2;
                System.out.printf("%d - %d = %.0f", n1, n2, result);
                if (result % 2 == 0) {
                    System.out.println(" - even");
                } else {
                    System.out.println(" - odd");
                }
                break;
            case "*":
                result = n1 * n2;
                System.out.printf("%d * %d = %.0f", n1, n2, result);
                if (result % 2 == 0) {
                    System.out.println(" - even");
                } else {
                    System.out.println(" - odd");
                }
                break;
            case "/":
                if (n1 == 0) {
                    System.out.printf("Cannot divide %d by zero", n2);
                } else if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    result = n1 / (n2 * 1.00);

                    System.out.printf("%d / %d = %.2f", n1, n2, result);
                }
                break;
            case "%":

                if (n1 == 0) {
                    System.out.printf("Cannot divide %d by zero", n2);
                } else if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    result = n1 % n2;
                    System.out.printf("%d %% %d = %.0f", n1, n2, result);
                }
                break;
        }


    }
}
