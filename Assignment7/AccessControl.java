package Assignment7;

public class AccessControl {
    public static void main(String[] args) {
        Rodent[] rodent = new Rodent[2];
        Mouse mouse = new Mouse();
        Rat rat = new Rat();

        rodent[0] = mouse;
        rodent[1] = rat;

        rodent[0].eat();
        rodent[0].move();

        rodent[1].eat();
        rodent[1].squeak();

//        Task 2

        Cycle[] c = new Cycle[3];

        Cycle unicycle = new Unicycle();
        Cycle bicycle = new Bicycle();
        Cycle tricycle = new Tricycle();

        c[0] = unicycle;
        c[1] = bicycle;
        c[2] = tricycle;

        Cycle cycle = new Tricycle();
        Tricycle tricycle2 = (Tricycle) cycle;

        System.out.println("Downcasting: ");
        tricycle2.balance();

        System.out.println("Upcasting: ");
        for(int i=0; i<3; i++)
            c[i].balance();

    }
}
