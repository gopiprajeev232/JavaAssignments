package Assignment7;

class FirstOuterClass {
    static class Inner {
        public Inner(String name, int age) {
            System.out.println(name+" "+age);
        }
    }
}

class SecondOuterClass {
    class Inner2 extends FirstOuterClass.Inner {
        public Inner2(FirstOuterClass firstOuterClass, String name, int age) {
            super(name, age);
        }
    }
}

public class InnerClassTest {
    public static void main(String[] args) {
        FirstOuterClass firstOuterClass = new FirstOuterClass();
        SecondOuterClass secondOuterClass = new SecondOuterClass();

        SecondOuterClass.Inner2 inner2 = secondOuterClass.new Inner2(firstOuterClass, "Prajeev", 23);
    }
}

