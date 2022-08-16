package ss12_java_collection_framework.practice.students_list_sort_by_age;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        hashMap.put("Giang",28);
        hashMap.put("Trường",26);
        hashMap.put("Hoàng",22);
        hashMap.put("Vinh",24);

        System.out.println("Đây là hashMap");
        System.out.println(hashMap);
        System.out.println(hashMap.entrySet());

//        treeMap.put("Giang",28);
//        treeMap.put("Trường",26);
//        treeMap.put("Hoàng",22);
//        treeMap.put("Vinh",24);

//        System.out.println("Đây là TreeMap");
//        System.out.println(treeMap);
//        System.out.println(treeMap.get("Vinh"));
//
//        linkedHashMap.put("Giang",28);
//        linkedHashMap.put("Trường",26);
//        linkedHashMap.put("Hoàng",22);
//        linkedHashMap.put("Vinh",24);
//
//        System.out.println("Đây là LinkedHashMap");
//        System.out.println(linkedHashMap);
//        System.out.println(linkedHashMap.get("Vinh"));

    }
}
