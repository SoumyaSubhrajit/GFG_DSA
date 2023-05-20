package Arrays_Basic_level;

public class Operating_an_array {
  public static boolean searchEle(int a[],int x)
    {
	    for(int i=0; i<a.length; i++)
	    {
	        if(x == a[i])
	        return true;
	    }
	   return false;
	}
	public static boolean insertEle(int a[],int y,int yi)
    { 
        if(yi<a.length)
        {
            a[yi] = y;
            return true;
        }
        return false;
            
	}
	public static boolean deleteEle(int a[],int z)
        {
		 for(int i=0; i<a.length; i++)
		 {
		     if(a[i] == z)
		     {
		         // then jump over the next item.
		         a[i] = a[i+1];
		        
		     }
		 }
		  return true;
	}

  public static void main(String[] args) {
    int[] arr = {801,661,730,878,305,320};
    System.out.println(searchEle(arr, 789));
    System.out.println(insertEle(arr, 1, 44));
    System.out.println(deleteEle(arr, 522));    
  }
}
