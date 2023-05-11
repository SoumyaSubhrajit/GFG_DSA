public class Value_equal_to_index_value {
  ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
    // code here
    ArrayList<Integer> Arr = new ArrayList<Integer>();
    for(int i=0; i<arr.length; i++){
        if(arr[i]== i+1){
            Arr.add(arr[i]);
        }
    }
    return Arr;
    
}
}
