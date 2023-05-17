public class Second_Largest {
  int print2largest(int arr[], int n) {
    // code here
//   Arrays.sort(arr);
//   int num1 =  arr.length - 1;
//   int num2 = arr.length-2;
//   if(arr[num1] != arr[num2]){
//   return arr[num2];
//   }
//   return arr[arr.length-3];
// }



int big = arr[0];
int secondBig = -1;
for(int i=0; i<arr.length; i++)
{
    if(arr[i]>big)
    {
        secondBig = big;
        big = arr[i];
    }else if(arr[i]> secondBig && arr[i] !=big)
    {
        secondBig= arr[i];
    }
}
    return secondBig;
} 
}
