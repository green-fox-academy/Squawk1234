package foxcom.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Fox {

    String name;
    String food;
    String drink;
    List<String> tricks = new ArrayList<>();

    public Fox(String name, String food, String drink) {
        this.name = name;
        this.food = food;
        this.drink = drink;
    }


}
