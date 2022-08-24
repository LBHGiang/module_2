package utils.read_and_write_binary_file;

import utils.exception.EmptyFileException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadBinaryFileUtil {

    public static List<Object> readBinaryFileUtil(String sourcePath) {
        List<Object> list = new ArrayList<>();

        try {
            FileInputStream fileInputStream = new FileInputStream(sourcePath);
            ObjectInputStream in = new ObjectInputStream(fileInputStream);

            list.add(in.readObject());
            in.close();
        } catch (EOFException e) {
            System.out.println("File rỗng!!");
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file!");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return list;
    }
}
