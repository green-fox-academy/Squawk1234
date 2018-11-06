public class TodoPrint {
    public static void main(String... args){
        //String todoText2 = " - Buy milk\n";

        StringBuilder todoText = new StringBuilder("My to do list:\n");
        todoText.append(" - Buy milk\n");
        todoText.append(" - Download games\n");
        todoText.append("     - Diablo");

        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        System.out.println(todoText.toString());
    }
}