package PetrolStation;

public class main {

    public static void main(String[] args) {

        Station shell = new Station();
        Car bmw = new Car();
        Car toyota = new Car();

        shell.refill(toyota);

        System.out.println(toyota.capacity);
        System.out.println(toyota.gasAmount);
        System.out.println(shell.gasAmount);

        System.out.println(bmw.capacity);
        System.out.println(bmw.gasAmount);
        System.out.println(shell.gasAmount);

     //   bmw.refill();
    }
}
