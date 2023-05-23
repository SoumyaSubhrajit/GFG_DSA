package Arrays_Basic_level;

public class Merge_and_Sort {
  public static int mergeNsort(int a[], int b[], int n, int m, int answer[])
  {
      // Write your code here.
     HashSet<Integer> hs = new HashSet<>();
     
     for(int i=0; i<n; i++)
     {
         hs.add(a[i]);
     }
     
     for(int i=0; i<m; i++)
     {
         hs.add(b[i]);
     }
     
     int k =0;
    for(int i: hs)
    {
        answer[k] = i;
        k++;
    }
     return k;
  }
}
