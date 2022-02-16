package Assignment5.prajeev.assignment.main;

import Assignment5.prajeev.assignment.data.TestClass;
import Assignment5.prajeev.assignment.singleton.Singleton;

public class MainClass {
    public static void main(String[] args) {
        TestClass t1 = new TestClass();
        t1.printInstanceVariables();
        t1.printLocalVariables();

        Singleton s = new Singleton();
        Singleton.setName("Prajeev");
        s.printString();
    }
}
