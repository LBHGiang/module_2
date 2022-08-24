package ss17_io_binary_file.practice.student_list_to_binary_file.mvc;

import utils.read_and_write_binary_file.ReadBinaryFileUtil;

import java.util.List;

public class MainController {
    public static void main(String[] args) {
//        List<Studenttt> students = new ArrayList<>();
//        students.add(new Studenttt(1, "Vũ Kiều Anh", "Hà Nội"));
//        students.add(new Studenttt(2, "Nguyễn Minh Quân", "Hà Nội"));
//        students.add(new Studenttt(3, "Đặng Huy Hoà", "Đà Nẵng"));
//        students.add(new Studenttt(4, "Nguyễn Khánh Tùng", "Hà Nội"));
//        students.add(new Studenttt(5, "Nguyễn Khắc Nhật", "Hà Nội"));

        String sourcePath = "src\\ss17_io_binary_file\\practice\\student_list_to_binary_file\\data\\source.dat";
        String targetPath = "src\\ss17_io_binary_file\\practice\\student_list_to_binary_file\\data\\target.dat";

        List students = ReadBinaryFileUtil.readBinaryFileUtil(targetPath);

//        students.add(new Studenttt(6, "Giang", "QB"));
        for (Object student :
                students) {
            System.out.println(student.toString());
        }


//        WriteBinaryFileUtil.writeBinaryFileUtil(targetPath,students);

    }
}
