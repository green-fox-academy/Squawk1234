package Green_Fox;

public class Mentor extends Person {

    public String level;

    public Mentor() {
        super();
        level = "intermediate";
    }

    public Mentor(String name, int age, String gender, String level) {
        super();
        this.level = level;
    }



    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }

    public void introduce(){
        System.out.println("Hi, I'm " + getName() + " , a " + getAge() + " year old " + getGender() + " " +  level + " mentor.");
    }
}
