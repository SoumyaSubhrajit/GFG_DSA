package Arrays_Basic_level;

public class Elements_before_which_no_element_is_bigger {
  static long countElements(long arr[], long n) 
  {
      // Your code goes here
  //   long max = arr[0];
  //   long count = 1;
  //   for(int i=1; i<arr.length; i++)
  //   {
  //       max = (long)Math.max(max , arr[i-1]);
  //       if(arr[i]>max)
  //       count++;
  //   }
  //   return count;
  
  
  long count=1;
  long num = arr[0];
  for(int i=1;i<arr.length;i++)
  {
      if(num<arr[i]){
      count++;
      num = arr[i];
      }
  }
  return count;
  }
}
