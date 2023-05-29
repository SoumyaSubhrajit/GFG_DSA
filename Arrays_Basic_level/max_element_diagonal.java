package Arrays_Basic_level;

public class max_element_diagonal {
  static int[] two_D(int[][] arr)
  {
      int max1 = Integer.MIN_VALUE;
      int max2 = Integer.MIN_VALUE;

      for (int i = 0; i < arr.length ; i++) {
          for (int j = 0; j <arr[i].length ; j++)
          {
              if((i==0 && j==0) || i==j || (i==arr.length-1  && j== arr[i].length-1))
                  max1 = Math.max(max1, arr[i][j]);

             if((i==0  && j==arr[i].length-1) || (i==j && i>0 && i< arr.length-1 ) || (i==arr[i].length-1  && j== 0))
                  max2 = Math.max(max2, arr[i][j]);
          }
          }
      return new int[] {max1, max2};
      }
}
