package ss17_io_binary_file.exercise.product_management;

import utils.read_and_write_binary_file.ReadBinaryFileUtil;
import utils.read_and_write_binary_file.WriteBinaryFileUtil;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private static final Scanner scanner = new Scanner(System.in);
    private static int choose;
    private final String PATH = "src\\ss17_io_binary_file\\exercise\\product_management\\data.dat";
    private List<Product> productList;

    public void displayProductList() {
        productList = readProductBinaryFile(PATH);
        if (productList.size() == 0) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        System.out.println("Danh sách sản phẩm: ");
        for (Product product :
                productList) {
            System.out.println(product.toString());
        }
    }

    public void addNewProduct() {
        productList = readProductBinaryFile(PATH);
        productList.add(getProductInfo());
        System.out.println("Thêm mới sản phẩm thành công!");

        writeProductBinaryFile(PATH, productList);
        displayProductList();
    }

    public Product getProductInfo() {
        String id;
        System.out.println("Vui lòng nhập thông tin cho sản phẩm: ");
        System.out.print("ID = ");
        do {
            id = scanner.nextLine();

        } while (idIsExist(id));
        System.out.print("Tên = ");
        String name = scanner.nextLine();
        System.out.print("Giá = ");
        double price = Double.parseDouble(scanner.nextLine());

        return new Product(id, name, price);
    }

    private boolean idIsExist(String id) {
        for (Product product :
                productList) {
            if (product.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public void removeProduct() {
        productList = readProductBinaryFile(PATH);
        Product product = findProductByID("xóa");
        if (product == null) {
            System.out.println("ID không tồn tại trong danh sách!");
            return;
        }
        System.out.println("Bạn có chắc chắn xóa sản phẩm này không?");
        System.out.println(product.toString());
        System.out.println("1- Có -----------2- Không");
        choose = Integer.parseInt(scanner.nextLine());
        if (choose == 1) {
            productList.remove(product);
            System.out.println("Xóa sản phẩm thành công");
            writeProductBinaryFile(PATH, productList);
        } else {
            System.out.println("Xóa sản phẩm không thành công");
        }
        displayProductList();
    }

    public Product findProductByID(String taskName) {
        productList = readProductBinaryFile(PATH);
        System.out.print("Vui lòng nhập ID của sản phẩm cần " + taskName + " ");
        String id = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId().equals(id)) {
                return productList.get(i);
            }
        }
        return null;
    }

    public void findProductByApproximateID() {
        productList = readProductBinaryFile(PATH);
        System.out.print("Mời bạn nhập id của sản phẩm: ");
        String id = scanner.nextLine();
        System.out.println("Kết quả tìm kiếm: ");
        for (Product product :
                productList) {
            if (product.getId().contains(id)) {
                System.out.println(product.toString());
            }
        }

    }

    public void sortProductListByPrice() {
        productList = readProductBinaryFile(PATH);
        System.out.println("Vui lòng chọn cách sắp xếp: ");
        System.out.println("1- Tăng dần---------- 2- Giảm dần ");
        choose = Integer.parseInt(scanner.nextLine());
        if (choose != 1 && choose != 2) {
            System.out.println("Lựa chọn bạn nhập không đúng");
            return;
        }
        if (choose == 1) {
            Collections.sort(productList);
        } else {
            Collections.sort(productList);
            Collections.reverse(productList);
        }
        System.out.println("Danh sách đã được sắp xếp:");
        writeProductBinaryFile(PATH, productList);
        displayProductList();
    }

    public void editProduct() {
        productList = readProductBinaryFile(PATH);
        Product product = findProductByID("chỉnh sửa");
        if (product == null) {
            System.out.println("ID không tồn tại trong danh sách!");
            return;
        }
        do {
            System.out.println("-----------------------------");
            System.out.println("Sản phẩm cần chỉnh sửa: ");
            System.out.println(product.toString());
            System.out.println("Bạn muốn chỉnh sửa nội dung nào?");
            System.out.println("1. ID");
            System.out.println("2. Tên");
            System.out.println("3. Giá");
            System.out.println("4. Thoát");
            System.out.println("Chọn nội dung cần chỉnh sửa: 1 -> 4");
            choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    product.setId(getEditInfo("ID"));
                    break;
                case 2:
                    product.setName(getEditInfo("tên"));
                    break;
                case 3:
                    product.setPrice(Double.parseDouble(getEditInfo("giá")));
                    break;
                case 4:
                    return;
            }
            System.out.println("Chỉnh sửa thành công!");
            writeProductBinaryFile(PATH, productList);
            System.out.println(product.toString());
            System.out.println("Bạn có muốn tiếp tục chỉnh sửa?");
            System.out.println("1- Có ------------- 2- Hoàn tất");
            choose = Integer.parseInt(scanner.nextLine());
            if (choose != 1) {
                return;
            }
        } while (true);
    }

    public String getEditInfo(String editContent) {
        System.out.print("Vui lòng nhập " + editContent + " mới: ");
        return scanner.nextLine();
    }

    public List<Product> readProductBinaryFile(String path) {
        List<Product> productList;
        productList = (List<Product>) ReadBinaryFileUtil.readBinaryFileUtil(path);
        return productList;
    }

    public void writeProductBinaryFile(String path, List<Product> list) {
        WriteBinaryFileUtil.writeBinaryFileUtil(path, list);
    }
}
