package Lesson06_NestedLoops.Lab;




public class P01_Clock {
    public static void main(String[] args) {

        for (int hours = 0; hours < 24; hours++) {
            for (int minutes= 0; minutes < 60 ; minutes++) {
                System.out.printf("%d:%d\n", hours, minutes);
            }
        }
    }
}
