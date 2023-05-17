package Module01_ProgrammingBasics.Exams.RegularExam;

import java.util.Scanner;

public class P03_CatLife {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String breed = scanner.nextLine();
        String gender = scanner.nextLine();
        int catMonths = 0;
        switch (gender){
            case "m":
                if (breed.equals("British Shorthair")){
                    catMonths = (13*12)/6;
                    System.out.printf("%.0f cat months", Math.floor(catMonths));
                } else if (breed.equals("Siamese")) {
                    catMonths = (15*12)/6;
                    System.out.printf("%.0f cat months", Math.floor(catMonths));
                }else if (breed.equals("Persian")) {
                    catMonths = (14*12)/6;
                    System.out.printf("%.0f cat months", Math.floor(catMonths));
                }else if (breed.equals("Ragdoll")) {
                    catMonths = (16*12)/6;
                    System.out.printf("%.0f cat months", Math.floor(catMonths));
                }else if (breed.equals("American Shorthair")) {
                    catMonths = (12*12)/6;
                    System.out.printf("%.0f cat months", Math.floor(catMonths));
                }else if (breed.equals("Siberian")) {
                    catMonths = (11*12)/6;
                    System.out.printf("%.0f cat months", Math.floor(catMonths));
                }else {
                    System.out.printf("%s is invalid cat!", breed);
                }
                break;
            case "f":
                if (breed.equals("British Shorthair")){
                    catMonths = (14*12)/6;
                    System.out.printf("%.0f cat months", Math.floor(catMonths));
                } else if (breed.equals("Siamese")) {
                    catMonths = (16*12)/6;
                    System.out.printf("%.0f cat months", Math.floor(catMonths));
                }else if (breed.equals("Persian")) {
                    catMonths = (15*12)/6;
                    System.out.printf("%.0f cat months", Math.floor(catMonths));
                }else if (breed.equals("Ragdoll")) {
                    catMonths = (17*12)/6;
                    System.out.printf("%.0f cat months", Math.floor(catMonths));
                }else if (breed.equals("American Shorthair")) {
                    catMonths = (13*12)/6;
                    System.out.printf("%.0f cat months", Math.floor(catMonths));
                }else if (breed.equals("Siberian")) {
                    catMonths = (12*12)/6;
                    System.out.printf("%.0f cat months", Math.floor(catMonths));
                }else {
                    System.out.printf("%s is invalid cat!", breed);
                }
                break;

        }

    }
}
