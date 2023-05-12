public class Check_String {
  Boolean check (String s)
    {
        // your code here 
        for(int i=1; i< s.length(); i++){
            char temp = s.charAt(0);
            char ch = s.charAt(i);
            if(ch != temp)
            return false;
        }
        return true;
    }
}
