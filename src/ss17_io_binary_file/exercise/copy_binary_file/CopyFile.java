package ss17_io_binary_file.exercise.copy_binary_file;

import ss17_io_binary_file.practice.student_list_to_binary_file.mvc.Studenttt;
import utils.read_and_write_binary_file.ReadBinaryFileUtil;
import utils.read_and_write_binary_file.WriteBinaryFileUtil;

import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        String sourcePath = "src\\ss17_io_binary_file\\exercise\\copy_binary_file\\source.dat";
        String targetPath = "src\\ss17_io_binary_file\\exercise\\copy_binary_file\\target.dat";
        List list = ReadBinaryFileUtil.readBinaryFileUtil(sourcePath);

//        list.add("Trường2");
//        list.add(32);
//        list.add(new Studenttt(22, "Tiến2", "Hue2"));

        WriteBinaryFileUtil.writeBinaryFileUtil(targetPath, list);
//        System.out.println(list);
    }
}
