package exam.services.read_and_write_files;

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
//            System.out.println("Không tìm thấy file!");
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
