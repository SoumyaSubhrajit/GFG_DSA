package Arrays_Basic_level;

public class Pair_array_product_sum {
  static int CountPairs (int arr[], int n) 
  {
      int count =0;

      for(int i=0; i< n-1; i++)
      {
          for(int j=i+1; j<n; j++)
          {
              if(arr[i] + arr[j] < arr[i] * arr[j])
              count++;
          }
      }

      return count;
  }
}
