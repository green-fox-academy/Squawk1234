package Pirates;

public class Pirate {
    private int drunkLevel;
    private boolean dead;

    public Pirate() {
        this.drunkLevel = 0;
        this.dead = false;
    }

    public Pirate(boolean dead) {
        this.drunkLevel = 0;
        this.dead = dead;
    }

     public void drinkSomeRum() {
        drunkLevel++;
    }



  /*  public String howsItGoingMate() {
        if (drunkLevel >= 4){
            return  "Pour me anuddder!";
        } drunkLevel = 0;
    } */

}

