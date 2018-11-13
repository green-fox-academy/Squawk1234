package Sharpie;

public class Sharpie {

   String color;
   double width;
   double inkAmount;

   public Sharpie() {
       this.inkAmount = 100;

   }

 /*  public Sharpie(String color) {
       this.color = color;
   }*/

  public void  use() {
      inkAmount --;
    }

}
