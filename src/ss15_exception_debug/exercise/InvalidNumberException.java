package ss15_exception_debug.exercise;

public class InvalidNumberException extends Exception {
    public InvalidNumberException(String str) {
        super(str);
    }

    public static void checkNumber(double number)throws  InvalidNumberException{
        if (number <= 0){
            throw new InvalidNumberException("Lỗi: Cạnh của tam giác phải > 0");
        }
    }
}
