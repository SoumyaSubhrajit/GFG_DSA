public class Display_longest_name {
  String longest(String names[], int n) {
    String word = null;
    int temp=0;
    int size = 0;
    for(int i=0;i<n; i++){
        size = names[i].length();
        if(size>temp){
            temp = size;
            word = names[i];
        }
    }
    return word;
}
}
