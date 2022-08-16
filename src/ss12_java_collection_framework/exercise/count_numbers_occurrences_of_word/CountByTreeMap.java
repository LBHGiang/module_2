package ss12_java_collection_framework.exercise.count_numbers_occurrences_of_word;

import java.util.*;

public class CountByTreeMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> count = new TreeMap<>();
        List<String> words;

        System.out.println("Vui lòng nhập vào một chuỗi: ");
        String string = scanner.nextLine();
        string = string.toLowerCase();
        words = Arrays.asList(string.split(" "));

        boolean isSpace;
        boolean isExist;
        for (String key : words) {
            isSpace = key.equals(" ");
            isExist = count.containsKey(key);
            if (isSpace) {
                continue;
            }
            if (!isExist) {
                count.put(key, 1);
            } else {
                count.put(key, count.get(key) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry :
                count.entrySet()) {
            System.out.printf("'%s' xuất hiện %d lần \n", entry.getKey(), entry.getValue());

        }
    }
}
