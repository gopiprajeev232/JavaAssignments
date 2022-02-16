package Assignment5.prajeev.assignment.singleton;

public class Singleton {
    String name;

    public static Singleton setName(String nameInput) {
//        Non-static fields cannot be referenced from a static function.
//        name = nameInput;
        return new Singleton();
    }

    public void printString() {
        System.out.println(name);
    }
}