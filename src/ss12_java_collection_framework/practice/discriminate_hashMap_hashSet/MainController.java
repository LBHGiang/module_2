package ss12_java_collection_framework.practice.discriminate_hashMap_hashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainController {
    public static void main(String[] args) {
        Student student1 = new Student("Giang", 28, "QB");
        Student student2 = new Student("Hoàng", 20, "HN");
        Student student3 = new Student("Mập", 24, "ĐN");

        Map<Integer, Student> hashMap = new HashMap<>();
        hashMap.put(1, student1);
        hashMap.put(2, student2);
        hashMap.put(3, student3);
        hashMap.put(4, student1);

        System.out.println("HashMap");
        for (Map.Entry<Integer, Student> element : hashMap.entrySet()
        ) {
            System.out.println(element.getKey()+"-"+element.getValue());
        }

        Set<Student> hashSet = new HashSet<>();
        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);
        hashSet.add(student1);

        System.out.println("HashSet");
        for (Student student :
                hashSet) {
            System.out.println(student.toString());
        }


    }
}
