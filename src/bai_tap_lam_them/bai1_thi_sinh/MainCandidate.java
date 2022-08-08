package bai_tap_lam_them.bai1_thi_sinh;

import java.util.Scanner;

public class MainCandidate {
    public static void main(String[] args) {

        //Nhập số lượng phần tử bằng method
        int numbers;
        numbers = inputNumber("The number of student ");

        //Tạo mảng đối tượng các thí sinh. Nhập phần tử cho mảng bằng method
        Candidate[] array = new Candidate[numbers];
        inputElementForArray(array);

//        // Xuất ra thông tin thí sinh có tổng điểm > 15 = foreach
//        for (Candidate element : array
//        ) {
//            if (element.getTotalScore() > 15) {
//                System.out.println(element.toString());
//            }
//        }

        // Xuất ra thông tin thí sinh có tổng điểm > 15 = forindex
        for (int i = 0; i < array.length; i++) {
            if (array[i].getTotalScore() > 15) {
                System.out.println(array[i].toString());
            }
        }


    }

    // Nhập phần tử cho mảng số đối tượng thí sinh, truyền vào mảng cần nhập phần tử
    public static void inputElementForArray(Candidate[] arr) {
        Scanner scanner = new Scanner(System.in);

        String name;
        double mathScore;
        double literatureScore;
        double englishScore;
        int i;
        for (i = 0; i < arr.length; i++) {
            //Lấy thông tin tên, điểm 3 môn
            System.out.printf("No = %d , Candidate Name = ", i + 1);
            name = scanner.nextLine();

            mathScore = inputScore("Math Score");
            literatureScore = inputScore("Literature Score");
            englishScore = inputScore("English Score");

            //Tạo đối tượng với tên và điểm 3 môn
            Candidate candidate = new Candidate(name, mathScore, literatureScore, englishScore);

            //Đưa đối tượng vừa tạo vào mảng
            arr[i] = candidate;
        }
    }

    //Phương thức nhập vào độ dài danh sách thí sinh
    public static int inputNumber(String nameOfVariable) {
        Scanner scanner = new Scanner(System.in);

        int number;
        boolean numberIsInvalid;

        System.out.print("Enter " + nameOfVariable);
        do {
            number = Integer.parseInt(scanner.nextLine());
            numberIsInvalid = number < 0 || number > 20;

            if (numberIsInvalid) {
                System.out.printf("Invalid input value\n" +
                        "Retype %s >=0 and %s <=20 \n" +
                        "Enter the %s", nameOfVariable, nameOfVariable,nameOfVariable);
            }

        } while (numberIsInvalid);
        return number;
    }

    //Phương thức  nhập điểm, yêu cầu >=0 và <=10
    public static int inputScore(String nameOfVariable) {
        Scanner scanner = new Scanner(System.in);

        int number;
        boolean numberIsInvalid;

        System.out.print("Enter " + nameOfVariable);
        do {
            number = Integer.parseInt(scanner.nextLine());
            numberIsInvalid = number < 0 || number > 10;

            if (numberIsInvalid) {
                System.out.printf("Invalid input value\n" +
                        "Retype %s >=0 and %s <=10 \n" +
                        "Enter the %s", nameOfVariable, nameOfVariable,nameOfVariable);
            }

        } while (numberIsInvalid);
        return number;
    }

}
