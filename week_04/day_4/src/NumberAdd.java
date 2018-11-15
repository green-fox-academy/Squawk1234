

public class NumberAdd {
    public static void main(String[] args) {
        System.out.println(adding(3));


    }
    public static int adding(int n) {

        if (n == 1) {
            return n;
        } else {
            return adding(n - 1) + n ;
        }
    }

}
