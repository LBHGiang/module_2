package ss1_introduction_to_java.practice;

import java.util.Scanner;

public class tinh_chi_so_can_nang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Weight = ?");
        double weight = Double.parseDouble(scanner.nextLine());

        System.out.println("Height = ?");
        double height = Double.parseDouble(scanner.nextLine());

        double bmi = weight / height / height;
        String classify;

        if (bmi < 18.5) {
            classify = "Underweight";
        } else if (bmi < 25.0) {
            classify = "Nomal";
        } else if (bmi < 30.0) {
            classify = "OverWeight";
        } else {
            classify = "Obese";
        }

        System.out.printf("Weight = %f, Height = %f, Classify = %s", weight, height, classify);

    }
}
