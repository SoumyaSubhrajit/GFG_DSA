import java.util.Arrays;

public class Print_the_left_element {
  public long leftElement(long arr[], long n)
  {
      // Your code goes here  
      Arrays.sort(arr);
       int l =arr.length;
       return (l%2==0)?(arr[l/2-1]):arr[l/2];
  }
}
