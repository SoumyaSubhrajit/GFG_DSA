package String_School;

public class Reversing_the_vowels {
          // Find the vowel first..
          char ch[] =s.toCharArray();;  
          int l = 0;
         int h= s.length()-1;
         while(l<h){
             char low = ch[l];
             char high = ch[h];
             if(isVowel(low) && isVowel(high))
              {
                  char temp = ch[l];
                  ch[l] = ch[h];
                  ch[h] =temp;
              }
             else if(!isVowel(low))
             l++;
             else
             h--;
         }
         return new String(ch);
    
      }
}
