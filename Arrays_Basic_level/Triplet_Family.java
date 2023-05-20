package Arrays_Basic_level;

import java.util.ArrayList;
import java.util.Arrays;

public class Triplet_Family {
  public static ArrayList<Integer> findTriplet(int a[], int n)
  {
       ArrayList<Integer> list = new ArrayList<>();
       // Sort the Array..
       Arrays.sort(a);
        for(int i=n-1; i>=2;i-- )
        {
            int l = 0, h=i-1;
            while(l<h)
            {
                if(a[l]+a[h] == a[i])
                {
                    list.add(a[l]);
                    list.add(a[h]);
                    list.add(a[i]);
                    return list;
                }
                else if(a[l]+a[h] > a[i])
                {
                    h--;
                }
                else{
                    l++;
                }
                
            }
           
        }
         return list;
  }
}
