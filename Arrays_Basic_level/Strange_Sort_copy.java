package Arrays_Basic_level;

public class Strange_Sort_copy {
  void strangeSort (int arr[], int n, int k)
  {
    // FIRST STEP TO STORE THE NON-CHANGE VALUE TEMP..
    int temp = arr[k-1];
    
    // CHANGE THE POSTION OF THE NON-CHANGE VALUE = 0
    arr[k-1]= 0;
    
    // SORT THE ARRAY.
    Arrays.sort(arr);
    
    // LOOP OVER THE ARRAY AND CHANGE THE VALUE TO THE ORIGINAL POSTION 
    // AFTER LOOPING OVER THE ARRAY WE HAVE A DUPLIVCATE VALUE.
    for(int i=0; i< k -1;i++)
    {
        arr[i] = arr[i+1];
    }
    // CHANGE THAT DUPLICATE VALUE TO ORIGIANAL CHANGE/TEMP VALUE.
    arr[k-1] = temp;
  }
}
