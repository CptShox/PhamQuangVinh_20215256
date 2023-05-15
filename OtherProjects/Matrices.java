public class Matrices {
    public static void main(String[] args) {
       
       // Define the two matrices to be added
       int[][] matrix1 = {{1, 2, 3}, {2, 3, 1}, {7, 8, 9}};
       int[][] matrix2 = {{3, 4, 5}, {1, 2, 3}, {1, 2, 3}};
       
       int[][] sum = new int[3][3];
       
       //adding each corresponding element
       for (int i = 0; i < matrix1.length; i++) {
          for (int j = 0; j < matrix1[i].length; j++) {
             sum[i][j] = matrix1[i][j] + matrix2[i][j];
          }
       }
       System.out.println("Sum of the two matrices:");
       for (int i = 0; i < sum.length; i++) {
          for (int j = 0; j < sum[i].length; j++) {
             System.out.print(sum[i][j] + " ");
          }
          System.out.println();
       }
    }
 }
 