package Arrays_Basic_level;

public class First_Come_First_Serve {
  // function to find the first element 
// occurring k number of times 
static int firstElement(int arr[], int n, int k) { 
  HashMap<Integer, Integer> map = new HashMap<>();
  
  for(int i: arr)
  {
      map.put(i, map.getOrDefault(i,0)+1);
  }
  
  for(int i:arr)
  {
      if(map.get(i) == k)
      return i;
  }
  return -1;
 }
}
