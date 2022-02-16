package Assignment6;

import java.sql.Ref;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Long> vampireNumbers = new ArrayList<Long>();

        for(long i=10; vampireNumbers.size()<100; i++) {
            if(VampireNumbers.isVampire(i)) {
                vampireNumbers.add(i);
            }
        }

        for(int i=0; i< vampireNumbers.size(); i++) {
            System.out.println(vampireNumbers.get(i));
        }

//        Task 2
        Task2 t = new Task2();

//        Task 3. It can be observed that no calls are made as the objects are not created.
        ReferencesTest[] refs;

//        Task 4
        refs = new ReferencesTest[2];
        refs[0] = new ReferencesTest("Prajeev");
        refs[1] = new ReferencesTest("Test1");
    }
}
