package Arrays_Basic_level;

public class First_element_to_occur_k_times {
  public int firstElementKTime(int[] arr, int N, int K) 
  {    
     int[] count = new int[1000];
     for(int i=0; i<N; i++)
     {
         count[arr[i]]++;
         if(count[arr[i]] == K)
         return arr[i];
     }
     return -1;
  
  } 
}
