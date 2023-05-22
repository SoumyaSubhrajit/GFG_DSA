package Arrays_Basic_level;

public class Binary_Array_Sorting {
   //Function to sort the binary array.
   static void binSort(int arr[], int N)
   {
       // add your code here
       
       
       /**************
       * No need to print the array
       * ************/
     
    int i = 0;
    int j = N-1;
    while(i<=j)
    {
        if(arr[i] == 1 && arr[j] == 0)
        {
           int temp = arr[i];
           arr[i] =arr[j];
           arr[j] = temp;
            i++;
            j--;
        }
        else if(arr[i] == 0)
        i++;
        else if(arr[j]==1)
        j--;
    }
   }
}
