package Animal;

public class main {

    public static void main(String[] args) {

        Animal fox = new Animal();
        Animal tiger = new Animal();
        Animal lion = new Animal();

        lion.drink();
        System.out.println("Lion thirst: " + lion.thirst);


        tiger.play();
        System.out.println("Tige hunger: " + tiger.hunger);
        System.out.println("Tiger thirst: " + tiger.thirst);

        fox.eat();
        System.out.println("Fox hunger: " + fox.hunger);





    }


}
