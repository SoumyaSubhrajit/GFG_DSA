public class Sum_of_Array_Elements {
  public static int sumElement(int arr[], int n)
    {
            int sum =0;
        for(int i=0; i<arr.length; i++){
            sum +=arr[i];
        }
        return sum;
    }
}
