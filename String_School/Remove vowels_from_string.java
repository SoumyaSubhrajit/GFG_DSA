package String_School;

public class Remove vowels_from_string {
  String removeVowels(String s) {
    // code here
//  String str = "";
//     for(int i=0;i<s.length(); i++)
//     {
//         char ch = s.charAt(i);
//         if(ch == 'a'  ||  ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
//             continue;
//         else{
//             str += ch;
//         }
//     }
//     return str;

  return s.replaceAll("[aeiouAEIOU]","");
}
}
