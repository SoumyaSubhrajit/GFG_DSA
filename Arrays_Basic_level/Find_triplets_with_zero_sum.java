package Arrays_Basic_level;

import java.util.Arrays;

public class Find_triplets_with_zero_sum {
      // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
  {
     int sum = 0;
     Arrays.sort(arr);
     for(int i=0; i<n-2; i++)
     {
         int l = i+1;
         int r = n-1;
         while(l<r)
         {
             sum = arr[i] + arr[l] + arr[r];
             if(sum == 0)
             return true;
             
             if(sum<0){
             l++;}
             else{
                 r--;
             }
         }
     }
     return false;
  }
}
