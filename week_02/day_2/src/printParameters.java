public class printParameters {

        public static void main(String[] args) {
            //  Create the usual class wrapper
            //  and main method on your own.

            // - Create a function called `printParams`
            //   which prints the input String parameters
            // - It can have any number of parameters

            // Examples
            printParams("first");
            printParams("first", "second");
            printParams("first", "second", "third", "fourh");
        }

        private static void printParams(String... first) {
            for (int i = 0; i < first.length; i++) {
                System.out.print(first[i] + " ");
            }
            System.out.println();
        }
    }
