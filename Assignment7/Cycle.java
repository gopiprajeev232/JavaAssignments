package Assignment7;

public class Cycle {
    public void balance() {
        System.out.println("Balance method of cycle");
    }
}

class Unicycle extends Cycle {
    public void balance() {
        System.out.println("Balance method of unicycle");
    }
}

class Bicycle extends Cycle {
    public void balance() {
        System.out.println("Balance method of bicycle");
    }
}

class Tricycle extends Cycle {

}
