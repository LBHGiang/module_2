package ss11_dsa_stack_queue.exercise.check_brackets_in_expressions_using_stack;

public class MainController {
    public static void main(String[] args) {
        String str1 = "s * (s – a) * (s – b) * (s – c)"; // well
        String str2 = "(– b + (b2 – 4*a*c)^0.5) / 2*a";//well
        String str3 = "s * (s – a) * (s – b * (s – c)";//f
        String str4 = "s * (s – a) * s – b) * (s – c)";//f
        String str5 = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";//well
        String str6 ="())";//f
        System.out.println(StackCheckBrackets.checkBrackets(str5));



    }
}
