package ss12_java_collection_framework.exercise.practice_using_ArrayList_LinkedList;

import java.util.Scanner;

public class MainController {
    private static final Scanner scanner = new Scanner(System.in);
    private static ProductManager productManager = new ProductManager();

    public static void main(String[] args) {

        int choice;
        while (true) {
            System.out.println("--------------------------------");
            System.out.println("Chào mừng bạn đến với chương trình quản lý sản phẩm");
            System.out.println("1. Hiển thị danh sách sản phẩm");
            System.out.println("2. Thêm mới sản phẩm");
            System.out.println("3. Cập nhật thông tin sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm");
            System.out.println("6. Sắp xếp sản phẩm");
            System.out.println("7. Thoát");
            System.out.print("Mời bạn nhập chức năng 1->7: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productManager.displayProductList();
                    break;
                case 2:
                    productManager.addNewProduct();
                    break;
                case 3:
                    productManager.editProduct();
                    break;
                case 4:
                    productManager.removeProduct();
                    break;
                case 5:
                    productManager.findProductByApproximateID();
                    break;
                case 6:
                    productManager.sortProductListByPrice();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn bạn nhập không đúng!");
            }
        }
    }
}
