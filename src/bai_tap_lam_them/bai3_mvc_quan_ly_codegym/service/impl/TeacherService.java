package bai_tap_lam_them.bai3_mvc_quan_ly_codegym.service.impl;

import bai_tap_lam_them.bai3_mvc_quan_ly_codegym.model.Teacher;
import bai_tap_lam_them.bai3_mvc_quan_ly_codegym.service.ITeacherService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private Scanner scanner = new Scanner(System.in);
    private static List<Teacher> teacherList = new ArrayList<>();

    static {
        teacherList.add(new Teacher(1, "QuangNN", "3030", "Nam", "Intructor"));
        teacherList.add(new Teacher(2, "HaiTT", "2313", "Nam", "Tutor"));
    }

    @Override
    public void addNewTeacher() {
        teacherList.add(getInforTeacher());
        System.out.println("Thêm giáo viên thành công!");
    }

    @Override
    public void displayAllTeacher() {
        for (Teacher teacher : teacherList
        ) {
            System.out.println(teacher.toString());
        }
    }

    @Override
    public void removeTeacher() {
        Teacher teacher = findTeacherById("xóa");
        if (teacher == null) {
            System.out.println("ID này không tồn tại trong danh sách.");
            return;
        }
        System.out.println("Bạn có chắc chắn muốn xóa giáo viên này không?");
        System.out.println(teacher.toString());
        System.out.println("1- Có ----------------- 2- Không");
        int choose = Integer.parseInt(scanner.nextLine());
        if (choose == 1) {
            teacherList.remove(teacher);
            System.out.println("Xóa giáo viên thành công");
        } else {
            System.out.println("Xóa giáo viên không thành công");
        }
    }

    public Teacher getInforTeacher() {
        System.out.println("Vui lòng nhập thông tin cho giáo viên: ");
        System.out.print("ID = ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Tên = ");
        String name = scanner.nextLine();
        System.out.print("Ngày sinh = ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Giới tính = ");
        String gender = scanner.nextLine();
        System.out.print("Chuyên môn = ");
        String speciality = scanner.nextLine();
        return new Teacher(id, name, dateOfBirth, gender, speciality);
    }

    public Teacher findTeacherById(String taskName) {
        System.out.print("Mời bạn nhập ID của giáo viên cần " + taskName);
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getId() == id) {
                return teacherList.get(i);
            }
        }
        return null;
    }
}
