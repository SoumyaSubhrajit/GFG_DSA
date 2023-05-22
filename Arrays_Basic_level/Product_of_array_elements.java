package Arrays_Basic_level;

public class Product_of_array_elements {
  public static Long product(Long arr[], Long mod, int n)
    {
        long mul = 1;
        for(int i=0;i<n;i++)
        {
            mul = mul* arr[i]%mod;
        }
        return mul;
    }
}
