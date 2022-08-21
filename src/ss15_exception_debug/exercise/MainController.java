package ss15_exception_debug.exercise;

public class MainController {
    public static void main(String[] args) {
        TriangleService triangleService = new TriangleService();

        triangleService.addNewTriangle();
        triangleService.addNewTriangle();

    }
}
