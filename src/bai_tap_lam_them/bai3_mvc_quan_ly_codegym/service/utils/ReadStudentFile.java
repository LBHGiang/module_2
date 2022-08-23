package bai_tap_lam_them.bai3_mvc_quan_ly_codegym.service.utils;

import bai_tap_lam_them.bai3_mvc_quan_ly_codegym.model.Student;
import utils.read_and_write_file_skip_line1.ReadFileUtil;
import java.util.ArrayList;
import java.util.List;

public class ReadStudentFile {
    public List<Student> readStudentFile(String path) {
        List<String> stringList = ReadFileUtil.readFile(path);
        List<Student> studentList = new ArrayList<>();

        String[] info;
        for (String string :
                stringList) {
            info = string.split(",");
            studentList.add(new Student(info[0], info[1], info[2], info[3], Double.parseDouble(info[4]), info[5]));
        }
        return studentList;
    }
}
