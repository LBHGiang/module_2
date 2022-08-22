package ss16_io_text_file.exercise.read_file_.csv;

import bai_tap_lam_them.bai3_mvc_quan_ly_codegym.model.Student;
import utils.read_and_write_all_file.ReadFileUtil;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCSV {
    public List<String> countries;

    public void readCountries(String path) throws IOException {
        List<String> stringList = ReadFileUtil.readFile(path);

        for (String string :
                stringList) {
            System.out.println(string);
        }
    }

    public static void main(String[] args) {
        ReadFileCSV readFileCSV = new ReadFileCSV();
        String path = "src\\ss16_io_text_file\\exercise\\read_file_\\csv\\country.csv";

        try {
            readFileCSV.readCountries(path);
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file nguồn!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
