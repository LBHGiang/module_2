package ss8_clean_code_and_refactoring.practice.mvc.service.impl;

import ss8_clean_code_and_refactoring.practice.mvc.model.Student;
import ss8_clean_code_and_refactoring.practice.mvc.service.IStudentServive;

public class StudentService implements IStudentServive {
    static Student[] students;
    static int size;

    static {
        students = new Student[100];
        students[0] = new Student(1, "Minh Châu", 2);
        students[1] = new Student(2, "Mậu Hoàng", 0.5);
        students[2] = new Student(3, "Hoàng Duy", 1.5);
        size = 3;
    }

    public void showAll() {
        for (int i = 0; i < size; i++) {
            System.out.printf("Thông tin sinh viên thứ %d\n", i + 1);
            System.out.println(students[i].toString());
        }
    }
}
