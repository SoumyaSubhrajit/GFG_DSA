import java.util.Arrays;

public class Smaller_and_Larger {
 public static int[] getMoreAndLess(int[] arr, int n, int x) {
    // code here

     int[] Arr  = {0,0};
     int lessCount = 0;
     int greatCount = 0;
    for(int i= 0; i<arr.length;i++){
        if(arr[i]<=x){
            lessCount++;
          Arr[0] = lessCount;
        }
        if(arr[i]>= x)
        {
            greatCount++;
            Arr[1] = greatCount; 
        }
         
    }
    return Arr;
}

public static void main(String[] args) {
  int N = 3; int X = 3;
 int Arr[] = {3,3,3};
 int res[] = getMoreAndLess(Arr, N, X);
 System.out.println(Arrays.toString(res));
}
}


