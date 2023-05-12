public class Addition_of_two_square_matrices {
  public void  Addition(int[][] matrixA, int[][] matrixB)
    {
        // code here
        // int matC[][] = new int [matrixA.length][matrixA.length];
        for(int i=0;i< matrixA.length; i++){
            for(int j=0; j<matrixA.length; j++){
               matrixA[i][j] = matrixA[i][j] + matrixB[i][j]; 
            }
        }
    }
}
