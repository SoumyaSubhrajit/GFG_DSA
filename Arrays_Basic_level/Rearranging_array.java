package Arrays_Basic_level;

public class Rearranging_array {
  public static void Rearrange(int a[], int n, int answer[])
  {
      Arrays.sort(a);
      int s = 0;
      int e = n-1;
      for(int i=0; i<n;i++)
      {
          if(i%2==0)
          {
              answer[i] = a[i-s];
              s++;
          }
          else{
              answer[i] = a[e];
              e--;
          }
      }
  }
}
