package Clonable;

public class main {

    public static void main(String[] args) {
        Person john = new Person("John", 20, "male");

       john.clone();

       Person johnClone = (Person) john.clone();
       johnClone.introduce();
    }
}
