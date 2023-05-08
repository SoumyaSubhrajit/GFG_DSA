public class Find_Index {
  // Function to find starting and end index 
  static int[] findIndex(int a[], int N, int key) 
  { 
    int[] ans = {-1,-1};
    for(int i=0; i< N;i++)
    {
        if(a[i] == key)
        {
            if(ans[0] == -1)
            {
                ans[0] = i;
            }
            ans[1] = i;
        }
    }
    return ans;
  }

  
}
