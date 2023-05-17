import java.util.Arrays;

public class Fascinating_Number {
  boolean fascinating(long n) {
    int twice = (int) n *2;
    int thrice =(int) n * 3;
    
    String s = n + "" + twice+ ""+ thrice;
   char[] str = s.toCharArray();
   char[] res = {'1','2','3','4','5','6','7','8','9'};
   Arrays.sort(str);
   
   if(Arrays.equals(str,res))
   return true;
    
    return false;
   }
  
}
