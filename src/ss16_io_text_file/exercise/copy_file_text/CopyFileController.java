package ss16_io_text_file.exercise.copy_file_text;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class CopyFileController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vui lòng nhập địa chỉ file nguồn: ");
        String readPath = scanner.nextLine();
        System.out.print("Vui lòng nhập địa chỉ file đích: ");
        String writePath = scanner.nextLine();

        String data = "";

        try {
            data = CopyFileText.readFile(readPath);
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file nguồn!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            CopyFileText.writeFile(writePath, data);
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file đích!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
