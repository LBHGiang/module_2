package ss15_exception_debug.exercise;

public class InvalidNumberException extends Exception {
    public InvalidNumberException(String str) {
        super(str);
    }
}
