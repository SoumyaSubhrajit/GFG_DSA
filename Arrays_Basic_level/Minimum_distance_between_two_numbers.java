package Arrays_Basic_level;

public class Minimum_distance_between_two_numbers {
  int minDist(int arr[], int n, int x, int y) {
    // Take 2 pointers..
    int a = -1;
    int b = -1;
    int i=0;
    // Take "min" that I assume is the min, and it should be return the min distance..
    int min = Integer.MAX_VALUE;
    // Itrate the whole array and try to find the x and y postion in the array..
     while(i<n)
     {
         if(arr[i] == x)
         {
          a = i;
         }
          if(arr[i]==y)
          {
          b = i;
          }
           i++;
          if(a!=-1 && b!=-1)
          {
           // Update the min..
           min = Math.min(min, Math.abs(a-b));
          }
     }
     
     if(a==-1 || b==-1){
      return -1;}
      return min;
  }
}
