import java.util.Scanner;
import java.util.Stack;
public class M2StackUse {
    

  public static boolean checkRedundantBrackets(String expression) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch != ')') {
                stack.push(ch);
            } else {
                boolean hasOperator = false;

                // Pop until opening bracket
                while (!stack.isEmpty() && stack.peek() != '(') {
                    char top = stack.pop();
                    if (top == '+' || top == '-' || top == '*' || top == '/') {
                        hasOperator = true;
                    }
                }

                // Remove the '('
                if (!stack.isEmpty()) {
                    stack.pop();
                }

                // If no operator found ? redundant
                if (!hasOperator) {
                    return true;
                }
            }
        }
        return false;
    }
      public static void main(String[] args) 
    {
	    Scanner sr = new Scanner(System.in);
        String expression = sr.nextLine();
    	System.out.println(checkRedundantBrackets(expression));
    }
}
