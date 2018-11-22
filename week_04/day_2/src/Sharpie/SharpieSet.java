package Sharpie;


import java.util.ArrayList;
import java.util.List;


public class SharpieSet {

List <Sharpie> SharpieList;


    public SharpieSet() {
        SharpieList = new ArrayList<>();
    }

    public int countUsable() {
       int count = 0;

        for (int i = 0; i < SharpieList.size(); i++) {
            if (SharpieList.get(i).inkAmount != 0) {
                count++;
            }

        }
        return count;

    }

    public List removeTrash() {
        for (int i = 0; i < SharpieList.size(); i++) {
            if (SharpieList.get(i).inkAmount == 0) {
                SharpieList.remove(i);
            }
        }
        return SharpieList;
    }

    public void add(Sharpie sharpie) {
        SharpieList.add(sharpie);
    }

    public void removeElement (Sharpie sharpie){
        SharpieList.remove(sharpie);
    }
}



