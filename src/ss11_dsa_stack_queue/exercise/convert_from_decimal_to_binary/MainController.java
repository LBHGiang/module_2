package ss11_dsa_stack_queue.exercise.convert_from_decimal_to_binary;

public class MainController {
    public static void main(String[] args) {
        int n = 25; //result = 11001
        System.out.println("Decimal = " + n);
        System.out.print("Binary = ");
        StackConvert.convertDecimalToBinary(n);
    }
}
