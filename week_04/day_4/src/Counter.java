public class Counter {

    public static void main(String[] args) {
        Counter(10);


    }
    public static int Counter(int n) {
        System.out.println(n);
        if (n == 1) {
            return 1;
        } else {
            return Counter(n - 1);
        }
    }

    }


