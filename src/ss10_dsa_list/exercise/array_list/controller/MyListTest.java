package ss10_dsa_list.exercise.array_list.controller;

import ss10_dsa_list.exercise.array_list.model.MyList;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> array = new MyList<>();
        array.add(0, 1);
        array.add(0, 2);
        array.add(0, 3);
        array.add(0, -4);
        System.out.println(array.toString());
        System.out.println(array.contains(5));

//        System.out.println(array.toString());


    }
}
