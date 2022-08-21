package ss13_search_algorithm.exercise.find_ascending_string;

import java.util.Map;
import java.util.TreeMap;

public class FindAscendingString {

    /**
     * Tìm chuỗi tăng dần dài nhất
     * Từng chuỗi tăng dần sẽ được lưu vào treemap theo
     * entry: key là Chiều dài, value là các chuỗi có chung độ dài
     *
     * @param string - chuỗi bàn đầu
     * @return trả về giá trị của entry cuối cùng trong treemap (key lớn nhất)
     */
    public static String findAscendingString(String string) {
        TreeMap<Integer, String> stringMap = new TreeMap<>();

        String newString;
        char last;
        int key;
        String value;
        for (int i = 0; i < string.length() - 1; i++) {
            newString = "";
            newString += string.charAt(i);
            for (int j = i + 1; j < string.length(); j++) {
                last = newString.charAt(newString.length() - 1);
                if (string.charAt(j) > last) {
                    newString += string.charAt(j);
                }
            }
            key = newString.length();
            if (!stringMap.containsKey(key)) {
                stringMap.put(key, newString);
            } else {
                value = stringMap.get(key) + " , " + newString;
                stringMap.put(key, value);
            }
        }
        return stringMap.lastEntry().getValue();

    }
}

