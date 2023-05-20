package Arrays_Basic_level;

public class Maximum_in_Struct_Array {
  class Height {
    int feet;
    int inches;
    public Height(int ft, int inc)
    {
        feet = ft;
        inches = inc;
    }
  }

  public static int findMax(Height arr[], int n)
  {
      int max = -1;
    for(int i=0; i<arr.length; i++)
    {
        max = Math.max(max , arr[i].feet*12 + arr[i].inches);
    }
      return max;
  }
}
