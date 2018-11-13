package Counter;

public class Counter {

    int a;
    int reset;

    public Counter(int origin) {
        a = origin;
        reset = origin;
    }

    public void add(int add) {
        a = a + add;
    }

    public void add() {
        a++;
    }

    public void get() {
        System.out.println(a);
    }

    public void reset() {
       a = reset;
    }

}
