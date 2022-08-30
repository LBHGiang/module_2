package case_study.furama_resort.utils.read_and_write;

import utils.read_and_write_file_skip_line1.WriteFileUtil;

import java.util.Map;

public class WriteMaintainFile {
    public void writeMaintainFile(Map<String, Integer> maintainList) {
        final String MAINTAIN_PATH = "src\\case_study\\furama_resort\\data\\maintain.csv";
        StringBuilder data = new StringBuilder("Service ID,Used Times\n");

        for (Map.Entry<String, Integer> entry : maintainList.entrySet()) {
            data.append(entry.getKey()).append(",").append(entry.getValue()).append("\n");
        }

        WriteFileUtil.writeFile(MAINTAIN_PATH, data.toString());
    }
}
