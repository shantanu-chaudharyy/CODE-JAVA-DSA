
import java.util.Scanner;
import java.util.Stack;

public class M2StackUsee {
    
 public static boolean checkRedundantBrackets(String expression) { // ((a+b))
		
        Stack<Character> stack = new Stack(); //
         
		
		
     for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch != ')') {
                stack.push(ch);
            } else {
                int count = 0;
                while (!stack.isEmpty() && stack.peek() != '(') {
                    stack.pop();
                    count++;
                }
                // pop the '('
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                // if nothing or only one element inside brackets → redundant
                if (count == 0) {
                    return true;
                }
            }
        }
        return false;
    }

 public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String expression = sr.next();
        System.out.println(checkRedundantBrackets(expression));
        sr.close();
    }
}