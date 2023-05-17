public class Perfect_Arrays {
  public boolean IsPerfect(int a[], int n)
    {
        int start = 0;
        int end = a.length-1;
        // Complete the function
        for(int i=0; i<a.length; i++){
            if(a[start]== a[end]){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
        
    }
  
}
