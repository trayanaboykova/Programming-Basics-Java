package Lesson04_ForLoop.MoreExercises;

public class P09_Clock {
    public static void main(String[] args) {
        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                System.out.printf("%d : %d\n", hour, minute);
            }
        }
    }
}
