import java.util.Arrays;

public class At_least_two_greater_elements {
  public long[] findElements( long a[], long n)
  {
      
    // Sort the element in increse..
    long[] arr = new long[a.length-2];
    Arrays.sort(a);
    for(int i=0; i< n-2; i++){
        arr[i] = a[i];
    }
    return arr;
  }
}
