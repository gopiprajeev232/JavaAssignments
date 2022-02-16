package Assignment2;

import java.util.HashSet;
import java.util.Scanner;

public class AlphabetChecker {
    public static void checkForAllLetters(String inputString) {
        HashSet<Character> alphabetSet = new HashSet<Character>();

        for(char character : inputString.toCharArray()) {
            if(String.valueOf(character).matches("^[a-z]$")) {
                alphabetSet.add(character);
            }
        }

        if(alphabetSet.size() == 26) {
            System.out.println("Yes, the string contains all the letters from the alphabet.");
        }

        else {
            System.out.println("No, the string doesn't contain all the letters from the alphabet.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String inputString = sc.nextLine();

        String caseInsensitiveString = inputString.toLowerCase();
        checkForAllLetters(caseInsensitiveString);
    }
}
