package AircraftCarrier;

public class Aircrafts {

    int maxAmmo;
    int baseDamage;
    String type;
    Boolean priority;

    public Aircrafts( ) {

    }

    public String getType() {
        return this.type;
    }

    public String getStatus() {
        return this.toString();
    }

    public boolean isPriority() {
        return this.priority;
    }




    @Override
    public String toString() {
        return "Aircrafts{" +
                "maxAmmo=" + maxAmmo +
                ", baseDamage=" + baseDamage +
                ", type='" + type + '\'' +
                ", priority=" + priority +
                '}';
    }
}
