package case_study.furama_resort.services.utils.read_and_write;

import java.io.*;

public class WriteFileUtil {
    public static void writeFile(String path, String data) {
        File file = new File(path);

        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
