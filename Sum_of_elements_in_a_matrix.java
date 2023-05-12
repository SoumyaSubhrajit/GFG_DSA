public class Sum_of_elements_in_a_matrix {
  int sumOfMatrix(int N, int M, int[][] Grid) {
    // code here
    int sum = 0;
    for(int i=0; i<N; i++){
        for(int j=0; j<M; j++){
            sum+= Grid[i][j];
        }
    }
    return sum;
}
}
