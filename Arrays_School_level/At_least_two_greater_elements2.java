import java.util.Arrays;

public class At_least_two_greater_elements2 {
  // This is sorting the array..
  public static void isSort(int[] arr){
    for (int i = 0; i < arr.length; i++) {
      int start = 0;
    int end = arr.length-i-1;
    int big = isBig(arr, start,end);
    swap(arr, end,big);
    }
  }

  private static void swap(int[] arr, int end, int big) {
    int temp = arr[big];
    arr[big] = arr[end];
    arr[end] = temp;
  }

  // Finding the biggest elem
  public static int isBig(int[] arr,int start, int end){
    int big = start;
    for(int i= start; i<= end;i++){
      if(arr[i]>arr[big]){
        big = i;
      }
    }
    return big;
  }
   public static void main(String[] args) 
   {
    int[] arr =  {11,45,2,9,50,24,60};
    isSort(arr);
    System.out.println(Arrays.toString(arr));
    for(int i=0; i<arr.length-2;i++)
    {
      System.out.println(arr[i]+" ");
    }
  }
}
