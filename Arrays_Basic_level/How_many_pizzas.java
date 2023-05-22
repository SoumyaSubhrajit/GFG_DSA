package Arrays_Basic_level;

public class How_many_pizzas {
  public static int getCommon(int stack1[], int stack2[]) {
    // Write your code here..
  HashSet<Integer> piz = new HashSet<>();
  
  // I store all the element that present in the stack into the hasset.
  for(int i=0; i<stack1.length; i++)
  {
      piz.add(stack1[i]);
  }
  
  int count = 0;
  // check the all values that present in the set or not..
  for(int i=0; i<stack2.length; i++)
  {
      if(piz.contains(stack2[i]))
      {
          count++;
          piz.remove(stack2[i]); // For delete the duplicates.
      }
  }
  return count;
}
}
