public class Palindromic_Array{
  public static int palinArray(int[] a, int n)
  {
         // Here I check the number is paliendrome or not..
         for(int i=0; i<a.length; i++)
         {
             int num = a[i];
             int temp = num;
             int rev = 0;
             while(num!=0)
             {
                 int rem = num % 10;
                  rev = rev *10 + rem;
                  num =  num /10;
             }
         
             if(!(temp == rev))
             {
               return 0;
                 
             }
            
         }
         return 1;
  }
  public static void main(String[] args) {
    int arr[]  = {111,222,333,23};
    int n = 3;
    int res = palinArray(arr, n);
    System.out.println(res);
  }
}
// add this