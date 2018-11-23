package ToDo;

public class Main {


    public static void main(String[] args) {
        Printusage usage = new Printusage();
        PrintToDo todo = new PrintToDo();
        AddNewTask newTask = new AddNewTask();

        if (args.length == 0) {
            usage.PrintUsage();
        } else if (args[0].equals("-l")) {
            todo.PrintToDo("-l");
        } else if (args[0].equals("-a")) {
            newTask.}


    }


}


