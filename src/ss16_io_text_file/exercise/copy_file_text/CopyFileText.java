package ss16_io_text_file.exercise.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {

    public static String readFile(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String data = "";
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            data += line + "\n";
        }
        bufferedReader.close();
        return data;
    }

    public static void writeFile(String path, String data) throws IOException {
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        data = data.substring(0, data.length() - 1);
        bufferedWriter.write(data);
        System.out.println("Số ký tự trong tệp: " + data.length());
        bufferedWriter.close();

        //src\ss16_io_text_file\exercise\copy_file_text\source_file.txt
        //src\ss16_io_text_file\exercise\copy_file_text\target_file.txt
    }
}
