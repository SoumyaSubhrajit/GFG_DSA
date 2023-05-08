public class Print_alternate_elements_of_an_array {
  public static void print(int arr[], int n)
    {
      int x= 0;
       while(n> arr.length){
        if(x%2 == 0){
          System.out.println(arr[x]);
          x++;
        }else{
          x++;
        }
       }
    }
  public static void main(String[] args) {
    int[] arr = {1,2,3,4};
    int n = 4;
    System.out.println("This is running!");
    print(arr, n);
  }
}
