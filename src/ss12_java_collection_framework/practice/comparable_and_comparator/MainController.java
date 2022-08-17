package ss12_java_collection_framework.practice.comparable_and_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainController {
    public static void main(String[] args) {
        Student student1 = new Student("Giang", 28, "QB");
        Student student2 = new Student("Hoàng", 22, "HN");
        Student student3 = new Student("Yuy", 24, "ĐN");
        Student student4 = new Student("Aôi", 25, "ĐN");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);


        System.out.println("Before");
        for (Student student :
                students) {
            System.out.println(student.toString());
        }

        //Comparable

        students.sort(Comparator.reverseOrder());
        System.out.println("After");
        for (Student student :
                students) {
            System.out.println(student.toString());
        }

        //IntsArrayComparator

//        IntsArrayComparator<Student> comparator = new AgeComparator();
//        students.sort(comparator);
//        System.out.println("After");
//        for (Student student :
//                students) {
//            System.out.println(student.toString());
//        }

    }
}
