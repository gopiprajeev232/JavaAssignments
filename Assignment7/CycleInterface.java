package Assignment7;

interface ICycle {
    void cycleInfo();
}

class Unicycle1 implements ICycle {
    public void cycleInfo() {
        System.out.println("This is a unicycle.");
    }
}

class Bicycle1 implements ICycle {
    public void cycleInfo() {
        System.out.println("This is a bicycle.");
    }
}

class Tricycle1 implements ICycle {
    public void cycleInfo() {
        System.out.println("This is a tricycle.");
    }
}

interface CycleFactory {
    ICycle getCycle();
}

class UnicycleFactory implements CycleFactory {
    public ICycle getCycle() {
        return new Unicycle1();
    }
}

class BicycleFactory implements CycleFactory {
    public ICycle getCycle() {
        return new Bicycle1();
    }
}

class TricycleFactory implements CycleFactory {
    public ICycle getCycle() {
        return new Tricycle1();
    }
}

public class CycleInterface {
    public static void rideCycle(CycleFactory cycleFactory) {
        ICycle cycle = cycleFactory.getCycle();
        cycle.cycleInfo();
    }

    public static void main(String[] args) {
        rideCycle(new UnicycleFactory());
        rideCycle(new BicycleFactory());
        rideCycle(new TricycleFactory());
    }
}
