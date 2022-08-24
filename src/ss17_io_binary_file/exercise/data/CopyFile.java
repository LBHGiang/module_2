package ss17_io_binary_file.exercise.data;

import ss17_io_binary_file.practice.student_list_to_binary_file.mvc.Studenttt;
import utils.read_and_write_binary_file.ReadBinaryFileUtil;
import utils.read_and_write_binary_file.WriteBinaryFileUtil;

import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        String sourcePath = "src\\ss17_io_binary_file\\exercise\\data\\source.dat";
        String targetPath = "src\\ss17_io_binary_file\\exercise\\data\\target.dat";
        List list = ReadBinaryFileUtil.readBinaryFileUtil(sourcePath);

//        list.add("Trường");
//        list.add(3);
//        list.add(new Studenttt(2, "Tiến", "Hue"));

        WriteBinaryFileUtil.writeBinaryFileUtil(targetPath, list);
//        System.out.println(list);
    }
}
