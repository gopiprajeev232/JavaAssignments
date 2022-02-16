package Assignment6;

public class Task2 {
    int num;
    public Task2(int num) {
        this.num = num;
        System.out.println("Overloaded constructor being called from default constructor. Number: "+num);
    }

    public Task2() {
        this(5);
    }
}
