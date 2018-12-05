package Pirates2;

public class Pirates {

    public int getDrunkLevel() {
        return drunkLevel;
    }

    private int drunkLevel;
    private boolean alive;
    private boolean passsout;

    public Pirates() {
        this.drunkLevel = 0;
        this.alive = true;
        this.passsout = false;
    }

    public void drinkSomeRum() {
        this.drunkLevel++;
    }

    public String howsItGoingMate() {
        if (drunkLevel < 4) {
            return "Pour me anudder!";
        } else {
            drunkLevel--;
            return "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
        }
    }

    public boolean isAlive() {
        return alive;
    }

    private boolean die() {
        return this.alive = false;
    }

    public void passOut() {
        this.passsout = true;
    }

    public void won() {
        this.drinkSomeRum();
    }

    public void loose() {

        this.die();
    }

    public boolean brawl(Pirates pirates) {
        if (this.calculateFight() > pirates.calculateFight()) {
            this.won();
            pirates.loose();
            return true;
        } else if (this.calculateFight() < pirates.calculateFight()) {
            pirates.won();
            this.loose();
            return false;
        } else {
            pirates.passOut();
            this.passOut();
            return true;
        }

    }


    public int calculateFight() {
        int min = 1;
        int max = 3;
        int calc = (int) (Math.random() *
                (max - min) + 1) + min;

        return calc;


    }
}
