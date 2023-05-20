package Arrays_Basic_level;

public class Magical_Number {
  public static int binarySearch(int arr[])
    {
        // your code here
        int s = 0;
        int e = arr.length-1;
        while(s<e)
        {
            int mid = s+(e-s)/2;
            if(arr[mid]== mid)
            { 
               return mid;  
            }
            if(arr[mid]< mid)
            {
                s = mid+1;
            }else{
                e = mid-1;
            }
            
        }
        return -1;
    }
  public static void main(String[] args) {
    int[] arr = {1,1,0};
    System.out.println(binarySearch(arr));
  }
}
