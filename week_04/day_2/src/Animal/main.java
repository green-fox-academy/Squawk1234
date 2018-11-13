package Animal;

public class main {

    public static void main(String[] args) {

        Animal fox = new Animal();
        Animal tiger = new Animal();

        tiger.play();
        System.out.println(tiger.hunger);
        System.out.println(tiger.thirst);

        fox.eat();
        System.out.println(fox.hunger);



    }


}
