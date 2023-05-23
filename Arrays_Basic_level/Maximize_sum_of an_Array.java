package Arrays_Basic_level;

public class Maximize_sum_of an_Array {
  int Maximize(int arr[], int n)
    {
        // Complete the function
       int  mod = 1000000007;
        Arrays.sort(arr);
        long sum  = 0;
        for(int i=0; i< arr.length; i++)
        {
           sum = (sum + (long) arr[i] * i)%mod; 
        }
         return (int)sum;
    } 
}
