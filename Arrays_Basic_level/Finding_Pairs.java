package Arrays_Basic_level;

public class Finding_Pairs {
  public static int count_pairs(char arr[], String s, int n, int m) 
  { 
      // Complete the function
      int count = 0;
      for(int i=0; i<n-1; i+=2)
      {
          if(s.indexOf(arr[i])>=0 && s.indexOf(arr[i+1])>=0){
              count++;
          }
      }
      return count;
  }
  
}
