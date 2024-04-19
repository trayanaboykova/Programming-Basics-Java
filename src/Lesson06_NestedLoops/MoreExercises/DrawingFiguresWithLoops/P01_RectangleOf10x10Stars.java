package Lesson06_NestedLoops.MoreExercises.DrawingFiguresWithLoops;

public class P01_RectangleOf10x10Stars {
    public static void main(String[] args) {
        int width = 10;
        int height = 10;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
