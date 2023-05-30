package String_School;

public class Extract_the_integers {
  ArrayList<String> extractIntegerWords(String s) 
    { 
          ArrayList<String> al = new ArrayList<String>();
        int i = 0;
        int len = s.length();
        while(i<len){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                String ans = "";
                while(i<len && s.charAt(i)>='0' && s.charAt(i)<='9'){
                    ans += s.charAt(i);
                    i++;
                }
                al.add(ans);
                ans = "";
            }
            i++;
        }
        return al;
    }
}
