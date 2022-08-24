package utils.read_and_write_binary_file;

import ss12_java_collection_framework.exercise.practice_using_ArrayList_LinkedList.Product;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class WriteBinaryFileUtil {

    public static void writeBinaryFileUtil(String targetPath, List list) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(targetPath);
            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);

            out.writeObject(list);
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
