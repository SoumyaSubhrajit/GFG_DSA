public class Check_for_Binary {
 static boolean  isBinary(String str)
	{
	  //Your code here
	 for(int i =0; i<str.length(); i++){
	     char ch = str.charAt(i);
	     if(ch !='0' && ch != '1'){
	         return false;
	     }
	 }
	 return true;
	}
  public static void main(String[] args) {
    
    String num = "0111100110101100";
    boolean res = isBinary(num);
    System.out.println(res);
  }
}
