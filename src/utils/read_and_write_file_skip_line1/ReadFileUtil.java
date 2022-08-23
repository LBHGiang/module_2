package utils.read_and_write_file_skip_line1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileUtil {
    public static List<String> readFile(String path){
        List<String> stringList = new ArrayList<>();
        File file = new File(path);

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            bufferedReader.readLine();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e){
            System.out.println("Không tìm thấy file!");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return stringList;
    }
}
