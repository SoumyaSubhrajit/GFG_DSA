public class Convert_a_list_of_characters_into_a_String {
  public String chartostr(char arr[], int N){
    String str = "";
    char[] res = new char[arr.length];
    for(int i=0;i<arr.length; i++){
        if(arr[i] != ' '){
            res[i] = arr[i];
        }
    }
    str = new String(res);
    return str;
}
}
