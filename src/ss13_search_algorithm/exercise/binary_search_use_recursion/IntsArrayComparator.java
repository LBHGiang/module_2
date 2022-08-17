package ss13_search_algorithm.exercise.binary_search_use_recursion;

import java.util.Comparator;

public class IntsArrayComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;
    }

    @Override
    public Comparator<Integer> reversed() {
        return null;
    }
}
