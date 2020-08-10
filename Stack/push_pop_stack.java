import java.io.*; 
import java.util.*; 

class push_pop_stack 
{ 
    static void stack_push(Stack<Integer> stack) 
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        stack.push(n); 
    } 
    
    static void stack_pop(Stack<Integer> stack) 
    { 
        System.out.println("Pop :"); 
        Integer y = (Integer) stack.pop(); 
        System.out.println(y+" poped"); 
    } 

	public static void main (String[] args) 
	{ 
		Stack<Integer> stack = new Stack<Integer>(); 
		Scanner in = new Scanner(System.in);
		while(true){
		    System.out.println("Enter 1 to push , 2 to pop and 0 to exit");
		    int n=in.nextInt();
		    if(n==1)
		      stack_push(stack);
		    else if(n==2)
		      stack_pop(stack);
		    else
		      break;
		  }
	} 
} 
