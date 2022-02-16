package Assignment7;

interface Interface1 {
    void print1();
    void print2();
}

interface Interface2 {
    void print3();
    void print4();
}

interface Interface3 {
    void print5();
    void print6();
}

interface Interface4 extends Interface1, Interface2, Interface3 {

}

class ConcreteClass {
    public void print7() {
        System.out.println("Print method variation 7");
    }
}

public class TestClass extends ConcreteClass implements Interface4 {
    @Override
    public void print1() {
        System.out.println("Print method variation 1");
    }

    @Override
    public void print2() {
        System.out.println("Print method variation 2");
    }

    @Override
    public void print3() {
        System.out.println("Print method variation 3");
    }

    @Override
    public void print4() {
        System.out.println("Print method variation 4");
    }

    @Override
    public void print5() {
        System.out.println("Print method variation 5");
    }

    @Override
    public void print6() {
        System.out.println("Print method variation 6");
    }

    public void interface1Input(Interface1 interface1) {
        interface1.print1();
    }

    public void interface2Input(Interface2 interface2) {
        interface2.print3();
    }

    public void interface3Input(Interface3 interface3) {
        interface3.print5();
    }

    public void interface4Input(Interface4 interface4) {
        interface4.print6();
    }

    public static void main(String[] args) {
        TestClass[] testClasses = new TestClass[4];
        TestClass inputObj = new TestClass();

        for(int i=0; i<4; i++)
            testClasses[i] = new TestClass();

        testClasses[0].interface1Input(inputObj);
        testClasses[1].interface2Input(inputObj);
        testClasses[2].interface3Input(inputObj);
        testClasses[3].interface4Input(inputObj);
    }
}
