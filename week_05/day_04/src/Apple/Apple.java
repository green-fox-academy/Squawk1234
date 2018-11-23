package Apple;

public class Apple {

    private String message;

    public Apple(String message) {
        this.message = message;
    }

    public String printMe() {
        System.out.println(message);
        return message;
    }

}
