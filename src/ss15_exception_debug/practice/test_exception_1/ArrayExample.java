package ss15_exception_debug.practice.test_exception_1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Integer[] array = createRandom();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nNhập vào chỉ số: 0 - 9");
            int index = Integer.parseInt(scanner.nextLine());
            try {
                System.out.printf("Element(%s) = %s", index, array[index]);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Chỉ số vượt quá giới hạn của mảng");
            }
        }
    }


    public static Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[10];
        System.out.println("Danh sách phần tử của mảng: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
}
