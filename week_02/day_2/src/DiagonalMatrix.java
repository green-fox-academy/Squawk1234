 public class DiagonalMatrix {



     public static void main(String[] args) {
         int[][] matrix = new int[5][5];

         for(int i=0; i < matrix.length; i++){
             for(int j=0; j < matrix[i].length; j++){

                 System.out.print(matrix[i][j]);
             }
             System.out.println();
         }
         System.out.println();





}}

// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output

 /* public static void main(String[] args) {
        int N = 4;
        int column = 0;

        for (int row = 0; row < N; row++) {
            for (column = row; column >= 0; column--) //prints till row number reaches 0
                System.out.print(column + " ");
            for (column = 1; column < N - row; column++)//from 1 to  N-row
                System.out.print(column + " ");

            System.out.println();
        }
    }*/
