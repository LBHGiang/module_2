package case_study.furama_resort.utils.read_and_write;

import case_study.furama_resort.models.Contract;
import case_study.furama_resort.utils.my_date.MyDate;
import utils.read_and_write_file_skip_line1.ReadFileUtil;

import java.text.ParseException;
import java.util.*;

public class ReadContractFile {
    public Set<Contract> readContractFile() {
        final String CONTRACT_PATH = "src\\case_study\\furama_resort\\data\\contract.csv";
        List<String> stringList = ReadFileUtil.readFile(CONTRACT_PATH);
        Set<Contract> contractSet = new TreeSet<>();

        String[] info;
        for (String string :
                stringList) {
            info = string.split(",");
            try {
                contractSet.add(new Contract(
                        info[0],
                        info[1],
                        new MyDate(info[2]),
                        new MyDate(info[3]),
                        info[4],
                        info[5],
                        info[6],
                        Double.parseDouble(info[7]),
                        Double.parseDouble(info[8])));
            } catch (ParseException e) {
                System.out.println("The data in the file is incorrect!");
            }
        }
        return contractSet;
    }

}
