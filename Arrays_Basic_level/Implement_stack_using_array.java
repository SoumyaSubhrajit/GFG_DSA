package Arrays_Basic_level;

public class Implement_stack_using_array {
  int top;
	int arr[] = new int[1000];

    void MyStack()
	{
		top = -1;
	}
	
	//Function to push an integer into the stack.
    void push(int a)
	{
	    if(top == arr.length){ // This will gave true when top will it reach 1000.
	    return;}
	    
	    // Other-wise
	    top++;
	    arr[top] = a;
	} 
	
    //Function to remove an item from top of the stack.
	int pop()
	{
	    
       if(top == -1)
       return -1;   // It will happen when top we haven't push anything..
       
       // false means our top at the last-index;
       int x = arr[top];
       top--;
       return x;
	}
}
