package String_School;

public class Count_type_of_Characters {
  int[] count (String s)
  {
     int upper = 0;
     int lower = 0;
     int numeric = 0;
     int spceial = 0;
     
     for(int i=0; i<s.length();i++)
     {
         char ch = s.charAt(i);
         if(ch >= 'a' && ch <= 'z')
         lower++;
         else if(ch>='A' && ch<= 'Z')
         upper++;
         else if(ch>=48 && ch<= 57)
         numeric++;
         else
         spceial++;
     }
     return new int[] {upper,lower,numeric,spceial};
  }
}
