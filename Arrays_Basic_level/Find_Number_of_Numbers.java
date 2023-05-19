package Arrays_Basic_level;

public class Find_Number_of_Numbers {
  public static int num(int a[], int n, int k)
  {
     // !. approch to the solution..
     // BY ONLY PLAYING INTGER...
     int count = 0;
     for(int i=0; i<a.length; i++)
     {
         int num = a[i];
         // CHECKING IF A SINGLE DIGIT MAY HAVE '1'
         if(num == k){
         count++;
         continue;
         }
         
         // CHECKING THE K OCCURANCE IN THE TOTAL ARRAY.
             while(num !=0)
             {
                 int rem = num % 10;
                 if(rem==k)
                 count++;
                 num = num / 10;
             }
         
     }
     return count;
  } 
}
