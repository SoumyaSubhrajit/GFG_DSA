public class Swap_kth_elements {
  void swapKth(int arr[], int n, int k) {
    // code here
    int end = arr.length- k;
    int start = arr.length - 1 - end;
    // Add the swap logic in it...
    
    int temp =arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    
}
}
