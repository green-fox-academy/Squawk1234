package Sharpie;

public class Sharpie {

   String color;
   double width;
   double inkAmount;


   public Sharpie(String color, int width) {
       this.inkAmount = 100;
       this.color = color;
       this.width = width;

   }

  public void  use() {
      inkAmount --;
    }

}
