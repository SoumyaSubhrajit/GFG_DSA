package Arrays_Basic_level;

public class Searching_a_number {
  public int search(int arr[], int n, int k) {
    for(int i=0; i<n; i++)
    { 
        if(arr[i] == k)
        return i+1;
        
        
    }
    return -1;
  }
}
