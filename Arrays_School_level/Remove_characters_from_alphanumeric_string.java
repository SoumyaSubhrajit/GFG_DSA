public class Remove_characters_from_alphanumeric_string {
  String removeCharacters(String S) {
    // code here
    String str= "";
    for(int i=0; i<S.length();i++){
        char ch = S.charAt(i);
        if(ch>=48 && ch<=57){
            // You have to add "+" you add more string in the str..
            str += Character.toString(ch);
        }
    }
    return str;
}
}
