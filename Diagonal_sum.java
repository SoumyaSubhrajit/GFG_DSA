public class Diagonal_sum {
  public int DiagonalSum(int[][] matrix)
  {
      // code here
      int sum1 = 0;
      int sum2= 0;
      for(int i=0; i<matrix.length; i++){
          for(int j=0; j<matrix.length; j++){
              if(i==j){
                  sum1 += matrix[i][j];
              }
              if(i+j == matrix.length-1){
                  sum2 += matrix[i][j];
              }
          }
      }
      
      return sum1+sum2;
  }
}
