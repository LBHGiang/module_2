package ss16_io_text_file.practise.sum_numbers_in_file_text;

import utils.read_and_write_all_file.ReadFileUtil;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class SumNumbersOfFile {

    public double sum(String path) throws IOException {
        List<String> stringList = ReadFileUtil.readFile(path);
        double sum = 0;
        for (String string : stringList
        ) {
//            System.out.println(string);
            sum += Double.parseDouble(string);

        }
        return sum;

    }

    public static void main(String[] args) {
        String path = "src\\ss16_io_text_file\\practise\\sum_numbers_in_file_text\\numbers.txt";
        SumNumbersOfFile sumNumbersOfFile = new SumNumbersOfFile();
        try {
            System.out.println("Tổng các số trong file là: " + sumNumbersOfFile.sum(path));
        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại!");
        } catch (IOException e) {
            System.out.println("Lỗi không đọc được file");
        }
    }

}
