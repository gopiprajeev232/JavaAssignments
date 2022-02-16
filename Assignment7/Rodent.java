package Assignment7;


public abstract class Rodent {
    abstract void move();
    abstract void eat();
    abstract void squeak();
}

class Mouse extends Rodent {
    public Mouse() {
        System.out.println("I am a mouse!");
    }

    @Override
    void move() {
        System.out.println("Mouse is moving");
    }

    @Override
    void eat() {
        System.out.println("Mouse is eating");
    }

    @Override
    void squeak() {
        System.out.println("Mouse is squeaking");
    }
}

class Rat extends Rodent {
    public Rat() {
        System.out.println("I am a rat!");
    }

    @Override
    void move() {
        System.out.println("Rat is moving");
    }

    @Override
    void eat() {
        System.out.println("Rat is eating");
    }

    @Override
    void squeak() {
        System.out.println("Rat is squeaking");
    }
}

