package Assignment1;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;

class Directory {
    public void listFilesMatchingAPattern(String directoryPath, String pattern)
    {
        File directory = new File(directoryPath);
        File[] filesInDirectory = directory.listFiles();

        for(File file : filesInDirectory) {
            String filePath = file.getAbsolutePath();

            if(file.isDirectory()) {
                listFilesMatchingAPattern(filePath, pattern);
            }

            else if(Pattern.matches(pattern, filePath)) {
                System.out.println(filePath);
            }
        }
    }
}

public class DirectoryPatternMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String directoryPath = System.getProperty("user.dir");

        System.out.print("Enter a pattern: ");
        String pattern = sc.next();
        System.out.println("Pattern is: "+pattern);
        Directory directory = new Directory();
        directory.listFilesMatchingAPattern(directoryPath, pattern);

        while(true) {
            System.out.print("Enter 1 to continue or -1 to exit: ");
            int input = sc.nextInt();

            if(input == 1) {
                System.out.print("Enter a pattern: ");
                pattern = sc.next();
                directory.listFilesMatchingAPattern(directoryPath, pattern);
            }

            else if(input == -1) {
                return;
            }

            else {
                System.out.println("Please enter valid input.");
            }
        }
    }
}
