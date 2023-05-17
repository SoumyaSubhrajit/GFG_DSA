package Arrays_Basic_level;

public class Replace_all_0's_with_5 {
  int convertfive(int num) {
    // Your code here
//     String str = String.valueOf(num);
//     char ch[] = str.toCharArray();
//     for(int i=0; i< ch.length;i++){
//         if(ch[i]== '0'){
//             ch[i] = '5';
//         }
// }
// str = new String(ch);
// int res =  Integer.parseInt(str);
// return res;

//////// Another way of doing this ////////////
String str = num+"";
str = str.replace('0','5');
return Integer.parseInt(str);
}
}
