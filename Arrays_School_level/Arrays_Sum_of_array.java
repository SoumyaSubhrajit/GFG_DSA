public class Arrays_Sum_of_array {
  public long getSum(long a[], long n)
  {
      // Your code goes here
      int sum =0;
      for(int i=0;i<n;i++){
          sum+=a[i];
      }
      return sum;
  }
}
