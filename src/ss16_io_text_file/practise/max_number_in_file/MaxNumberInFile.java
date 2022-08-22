package ss16_io_text_file.practise.max_number_in_file;

import utils.read_and_write_all_file.ReadFileUtil;
import utils.read_and_write_all_file.WriteFileUtil;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class MaxNumberInFile {

    /**
     * Tìm max của file text chứa các số nguyên
     * Lệnh catch cho phép bỏ qua các dòng rỗng ""
     * @param path là đường dẫn tương đối của file
     * @return int max
     * @throws IOException
     */
    public int findMaxOfFile(String path) throws IOException {
        List<String> stringList = ReadFileUtil.readFile(path);
        int max = Integer.parseInt(stringList.get(0));
        for (String string : stringList
        ) {
            try {
                if (max < Integer.parseInt(string)) {
                    max = Integer.parseInt(string);
                }
            } catch (NumberFormatException e) {
            }
        }
        return max;
    }

    public void writeMaxToFile(String path, int max) throws IOException {
        String result = max + "";
        WriteFileUtil.writeFile(path, result);
    }

    public static void main(String[] args) {
        String readPath = "src\\ss16_io_text_file\\practise\\max_number_in_file\\numbers.txt";
        String writePath = "src\\ss16_io_text_file\\practise\\max_number_in_file\\result.txt";
        MaxNumberInFile readAndWrite = new MaxNumberInFile();
        int max;

        try {
            max = readAndWrite.findMaxOfFile(readPath);
            readAndWrite.writeMaxToFile(writePath, max);
        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại!");
        } catch (IOException e) {
            System.out.println("Lỗi không đọc được file");
        }
    }
}
