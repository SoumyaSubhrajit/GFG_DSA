public class Find_difference_between_sum_of_diagonals {
  int diagonalSumDifference(int N, int[][] Grid) {
    // code here
    int rightDiagonal = 0;
    int leftDiagonal = 0;
    for(int i=0; i<N; i++){
        for(int j=0; j<N; j++){
            // sum of right diagonal;
            if( i == j){
                rightDiagonal += Grid[i][j];
            }
            // // sum of left diagonal;
            if(i+j == N-1){
                leftDiagonal +=Grid[i][j];
            }
        }
    }
   if(rightDiagonal > leftDiagonal)
   return rightDiagonal - leftDiagonal;
   return leftDiagonal - rightDiagonal;
}
}
