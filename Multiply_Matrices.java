public class Multiply_Matrices {
  public static void multiply(int A[][], int B[][], int C[][], int N)
        {
          for(int i=0;i<N;i++){
              for(int j=0;i<N;j++){
                  // I add a for loop for the change of i and j in the respective mat..
                  for(int k= 0;i< N;k++){
                      C[i][j] +=((A[i][k]) * (B[k][j])) ;
                  }
              }
          }
        }
        public static void main(String[] args) {
          int[][] A = {{7, 8}, {2 , 9}};
          int B[][] = {{14, 5}, {5, 18}};
          int N = 2;
            multiply(A, B, B, N);
        }
}
