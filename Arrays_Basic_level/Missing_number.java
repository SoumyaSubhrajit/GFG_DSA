package Arrays_Basic_level;

public class Missing_number {
    
  public static int missingNumber(int A[], int N)
  {
       // Your code goes here
       //Formula N natural number - rest number sum.
       int math = N*(N+1)/2;
       int sum = 0;
       for(int i=0; i<A.length; i++)
       {
           sum +=A[i];
       }
       return math - sum;
  }
}
