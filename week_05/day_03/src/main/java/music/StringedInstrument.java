package main.java.music;

abstract class StringedInstrument extends Instrument {

    int numberOfStrings;

    protected StringedInstrument (String name,int numberOfStrings){
        super(name);
        this.numberOfStrings = numberOfStrings;
    }





    public void sound(){
    }

}
