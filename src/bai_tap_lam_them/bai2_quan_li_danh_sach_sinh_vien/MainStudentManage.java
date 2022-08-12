package bai_tap_lam_them.bai2_quan_li_danh_sach_sinh_vien;

import java.util.Scanner;

public class MainStudentManage{
    public static void main(String[] args) {
        Student[] array = {};

        array = addStudent(array);
        array = addStudent(array);
        array = addStudent(array);
        //in ra
        printStudentList(array);
        //sắp xếp rồi in ra
        sortStudentList(array);
        printStudentList(array);
        //xóa rồi in ra
        array = removeStudenByIndex(array, 1);
        printStudentList(array);


    }

    //Thêm 1 sinh viên vào cuối danh sách. Truyền vào mảng đã có
    public static Student[] addStudent(Student[] arr) {
        Scanner scanner = new Scanner(System.in);

        //Lấy các thông tin SV
        String code = inputValue("Code");
        String name = inputValue("Name");
        String birthday = inputValue("birthday");
        boolean gender = Boolean.parseBoolean(inputValue("Gender. Enter 'true' if Male. Enter 'false' if is not Male   "));
        String className = inputValue("Class Name");
        //Tạo sinh viên mới
        Student student = new Student(code, name, birthday, gender, className);

        //Thêm sinh viên vào mảng
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length - 1] = student;

        return newArr;
    }

    //Hàm nhập dữ liệu (nhận vào tên của dữ liêu -> trả về dữ liệu kiểu String)
    public static String inputValue(String nameOfVariable) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter " + nameOfVariable + " ");
        return scanner.nextLine();
    }

    //Xóa 1 sinh viên với MSSV
    public static Student[] removeStudenByCode(Student[] arr, String code) {
        int index = -1;
        //tìm index của SV muốn xóa
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().equals(code)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("That Student is not Exist!");
            return arr;
        }

        //Xóa
        Student[] newArr = new Student[arr.length - 1];
        for (int i = 0, j = 0; i < newArr.length; j++) {
            if (j == index) {
                continue;
            }
            newArr[i] = arr[j];
            i++;

        }

        return newArr;
    }

    //Xóa SV ở vị trí index (vị trí đầu tiên là 0)
    public static Student[] removeStudenByIndex(Student[] arr, int index) {
        index--; //chuyển vị trí đầu tiên là 1 thành vị trí đầu tiên là 0
        if (index < 0 || index >= arr.length) {
            System.out.println("This index is invalid");
            return arr;
        }
        Student[] newArr = new Student[arr.length - 1];
        for (int i = 0, j = 0; i < newArr.length; j++) {
            if (j == index) {
                continue;
            }
            newArr[i] = arr[j];
            i++;

        }

        return newArr;
    }

    //Tìm SV theo MSSV hoặc Tên
    public static String searchStuden(Student[] arr, String str) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().equals(str)) {
                return arr[i].toString();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().equals(str)) {
                return arr[i].toString();
            }
        }
        return str + "is not exist!";

    }

    //In ra nội dung danh sách sv
    public static void printStudentList(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("No%d Student Code: %s, Name: %s, gender: %s, Class:%s\n",
                    i + 1, arr[i].getCode(), arr[i].getName(), arr[i].getGender(), arr[i].getClassName());
        }
    }

    //Sắp xếp theo cột MSSV
    public static void sortStudentList(Student[] arr) {


        Student x = new Student();
        int char1;
        int char2;
        int length1;
        int length2;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                length1 = arr[i].getCode().length();
                length2 = arr[j].getCode().length();
                for (int k = 0; k < length1 && k < length2; k++) {
                    char1 = (int) arr[i].getCode().charAt(k);
                    char2 = (int) arr[j].getCode().charAt(k);
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
