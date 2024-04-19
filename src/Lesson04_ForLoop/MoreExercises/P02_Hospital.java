package Lesson04_ForLoop.MoreExercises;

import java.util.Scanner;

public class P02_Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        int doctors = 7;
        int treatedPatients = 0;
        int untreatedPatients = 0;

        for (int i = 1; i <= days; i++) {
            int patientsToday = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0) {
                if (untreatedPatients > treatedPatients) {
                    doctors++;
                }
            }

            if (patientsToday <= doctors) {
                treatedPatients += patientsToday;
            } else {
                treatedPatients += doctors;
                untreatedPatients += patientsToday - doctors;
            }
        }
        System.out.println("Treated patients: " + treatedPatients + ".");
        System.out.println("Untreated patients: " + untreatedPatients + ".");
    }
}
