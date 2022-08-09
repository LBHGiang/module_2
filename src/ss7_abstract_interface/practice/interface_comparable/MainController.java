package ss7_abstract_interface.practice.interface_comparable;

import java.util.Arrays;

public class MainController {
    public static void main(String[] args) {
        Comparable[] comparables = new Comparable[3];
        comparables[0] = new ComparableCircle();
        comparables[1] = new ComparableCircle(4.0);
        comparables[2] = new ComparableCircle(2.5, "Yellow", true);

        //display before sort
        for (Comparable comparable : comparables
        ) {
            System.out.println(comparable.toString());
        }

        Arrays.sort(comparables);

        //display after sort
        System.out.println("After sort");
        for (Comparable comparable : comparables
        ) {
            System.out.println(comparable.toString());
        }
    }
}
