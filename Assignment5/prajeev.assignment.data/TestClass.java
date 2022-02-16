package Assignment5.prajeev.assignment.data;

public class TestClass {
    int num;
    char character;

    public void printInstanceVariables() {
        System.out.println(num+" "+character);
    }

    public void printLocalVariables() {
        int num2;
        char char2;

//        This is not possible as local variables need to be initialized.
//        System.out.println(num2+" "+char2);
    }
}
