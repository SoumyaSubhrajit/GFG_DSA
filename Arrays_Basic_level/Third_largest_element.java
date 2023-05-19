package Arrays_Basic_level;

import java.util.Arrays;

public class Third_largest_element {
  int thirdLargest(int a[], int n)
  {
   // Sort the array...
   Arrays.sort(a);
   int big = a[0];
   for(int i=1; i<a.length-2; i++)
   {
       if(a[i]>big)
       {
           big = a[i];
       }
   }
   return big;
  }
}
