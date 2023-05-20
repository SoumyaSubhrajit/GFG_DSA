package Arrays_Basic_level;

public class Play_with_an_array {
  public int[] formatArray(int[] a,int n)
        {
            int temp = 0;
        for(int i=0; i<a.length;i++)
        {
            if(i%2!=0 && a[i] < a[i-1])
            {
                temp  = a[i];
                a[i] = a[i-1];
                a[i-1] = temp;
            }
        }
        return a;
	}
}
