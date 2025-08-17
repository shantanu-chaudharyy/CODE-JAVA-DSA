import java.util.Stack;

public class StackDemo {
  
    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();

        int arr[] = {1,2,3,4,5};
        // stack.add(99);
           


        for(int i = 1; i<= arr.length; i++) {

            stack.push(i);

        }
      
      //  System.out.println(stack.peek());
        stack.add(2, 99);
        
for(int i = 0; i<=arr.length; i++) {
    System.out.println(stack.pop());
}
            
        }
    
}
