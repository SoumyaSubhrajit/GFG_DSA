package Arrays_Basic_level;

public class Search_an_Element_in_an_array {
  static int search(int arr[], int N, int X)
  {
      
      // Liner Search
      // for(int i=0; i<N;i++)
      // {
      //     if(arr[i] == X)
      //     return i;
      // }
      // return -1;
      
      // Binary Search..
    
          int s = 0;
          int e =N-1;
          while(s<=e)
          {
              int mid = s+ (e-s) /2;
              if(arr[mid] == X)
              return mid;
              
              if(arr[mid] <X)
              {
              s = mid+1;
              }
              else if(arr[mid] > X)
              {
                  e = mid-1;
              }

          }
           return -1;
  }
}
