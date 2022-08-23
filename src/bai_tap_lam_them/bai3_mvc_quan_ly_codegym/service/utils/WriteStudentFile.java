package bai_tap_lam_them.bai3_mvc_quan_ly_codegym.service.utils;

import bai_tap_lam_them.bai3_mvc_quan_ly_codegym.model.Student;
import utils.read_and_write_file_skip_line1.WriteFileUtil;

import java.util.List;

public class WriteStudentFile {
    public void writeStudentFile(String path, List<Student> studentList) {
        String data = "id,name,dateOfBirth,gender,score,className\n";

        for (Student student : studentList) {
            data += student.toStringOfFile() + "\n";
        }

        WriteFileUtil.writeFile(path, data);
    }
}
