package ss8_clean_code_and_refactoring.practice.mvc.controller;

import ss8_clean_code_and_refactoring.practice.mvc.service.impl.StudentService;
import ss8_clean_code_and_refactoring.practice.mvc.service.IStudentServive;
import java.util.Scanner;

public class StudentController {
    public void displayMenu() {
        //CRUD
        // C - Create
        // R - Read
        // U - Update
        // D - Delete

        Scanner scanner = new Scanner(System.in);
        int choose;

        IStudentServive iStudentService = new StudentService();
        while (true) {
            System.out.println("Mời bạn chọn chức năng");
            System.out.println("1. Tạo mới sinh viên");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Chỉnh sửa thông tin sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Kết thúc");

            System.out.print("Hãy chọn chức năng: ");
            choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    //Làm gì đó
                    break;
                case 2:
                    iStudentService.showAll();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
            }
            //line 36
        }
        // line 38
        // Còn những chức năng tiếp theo

        // Bước 1: Tạo menu
        // Bước 2: Chuẩn bị data
        // Bước 3: Cấu hình các chức năng
    }
}
