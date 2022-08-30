package case_study.furama_resort.utils.read_and_write;

import utils.read_and_write_file_skip_line1.ReadFileUtil;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReadMaintainFile {
    public Map<String, Integer> readMaintainFile() {
        final String MAINTAIN_PATH = "src\\case_study\\furama_resort\\data\\maintain.csv";
        List<String> stringList = ReadFileUtil.readFile(MAINTAIN_PATH);
        Map<String, Integer> maintainList = new LinkedHashMap<>();

        String[] info;
        for (String string :
                stringList) {
            info = string.split(",");
            maintainList.put(info[0], Integer.parseInt(info[1]));
        }
        return maintainList;
    }
}
