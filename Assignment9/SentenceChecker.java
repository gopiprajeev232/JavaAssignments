package Assignment9;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SentenceChecker {
    static void verifyString(String inputStr) {
        String pattern = "^[A-Z].*[.]$";

        if(Pattern.matches(pattern, inputStr)) {
            System.out.println("True");
        }

        else {
            System.out.println("False");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputStr = sc.nextLine();

        verifyString(inputStr);
    }
}
