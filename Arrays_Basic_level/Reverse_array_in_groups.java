package Arrays_Basic_level;

public class Reverse_array_in_groups {
  void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
    int[] brr =  new int[n];
    for(int i=0;i <n; i++)
    {
        brr[i] = arr.get(i);
    }
      for(int i=0; i<n; i +=k)
      {
          int l = i;
          int r = Math.min(i+k-1, n-1);
          while(l<r)
          {
              int temp = brr[l];
              brr[l] = brr[r];
              brr[r] = temp;
              l++;
              r--;
          }
      }
      
     arr.clear();
     for(int i=0; i< brr.length; i++)
     {
         arr.add(brr[i]);
     }
    }
}
