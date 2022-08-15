package ss11_dsa_stack_queue.exercise.check_palindrome_string_using_queue;

public class MainController {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Able was I ere I saw Elba";

        System.out.print(str1 + " is Palindrome: ");
        System.out.println(QueueCheckPalindrome.checkPalindrome(str1));
        System.out.print(str2 + " is Palindrome: ");
        System.out.println(QueueCheckPalindrome.checkPalindrome(str2));

    }
}
