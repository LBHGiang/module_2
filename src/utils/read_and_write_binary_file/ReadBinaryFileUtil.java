package utils.read_and_write_binary_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadBinaryFileUtil {

    public static List readBinaryFileUtil(String sourcePath) {
        List list = new ArrayList();

        try {
            FileInputStream fileInputStream = new FileInputStream(sourcePath);
            ObjectInputStream in = new ObjectInputStream(fileInputStream);

            list = (List) in.readObject();
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file!");
        } catch (EOFException e) {
            System.out.print("");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
}
