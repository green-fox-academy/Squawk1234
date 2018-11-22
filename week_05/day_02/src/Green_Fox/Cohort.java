package Green_Fox;

import java.util.ArrayList;
import java.util.List;

public class Cohort {

    String name;
    List students = new ArrayList();
    List mentors = new ArrayList();

    public Cohort(String name) {
        this.name = name;
    }


    public void addStudent(Student adding) {
        students.add(adding);
    }

    public void addMentor(Mentor addingM) {
        mentors.add(addingM);
    }

    public void info() {
        System.out.println("The name cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
    }
}
