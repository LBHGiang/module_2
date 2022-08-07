package bai_tap_lam_them;

import java.util.Arrays;

public class Test {
    private String name = "";
    private int phone = 0;

    public Test() {
    }

    public Test(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }

    public static void main(String[] args) {
        Test test1 = new Test("Giang", 123);
        Test test2 = new Test("Gia", 1343);
        Test test3 = new Test("Gian", 5345);
        Test test4 = new Test("Gi", 1253);
        Test[] arr = {test1, test2, test3, test4};
        sortStudentList(arr);
        System.out.println(Arrays.deepToString(arr));
        System.out.println((int) arr[0].getName().charAt(0));
        System.out.println((int) arr[1].getName().charAt(0));
        System.out.println((int) arr[2].getName().charAt(0));
        System.out.println((int) arr[3].getName().charAt(0));


    }

    public static void sortStudentList(Test[] arr) {
        Test x = new Test();

        int char1;
        int char2;
        int length1;
        int length2;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                length1 = arr[i].getName().length();
                length2 = arr[j].getName().length();
                for (int k = 0; k < length1 && k < length2; k++) {
                    char1 = (int) arr[i].getName().charAt(k);
                    char2 = (int) arr[j].getName().charAt(k);
                    if (char1 < char2) {
                        break;
                    }
                    if (char1 > char2 ||
                            ((k == length1 - 1 || k == length2 - 1) && length1 > length2)) {
                        x = arr[i];
                        arr[i] = arr[j];
                        arr[j] = x;
                        break;

                    }
                }
            }
        }
    }


}



