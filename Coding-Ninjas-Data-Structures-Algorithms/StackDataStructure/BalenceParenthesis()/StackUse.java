

import java.util.Scanner;
import java.util.Stack;

public class StackUse {

        public static boolean isBalanced(String expression) {

            
                    Stack<String> stack = new Stack<>();

                    for(int i = 0; i < expression.length(); i++) {
                        
                        if(expression.charAt(i) == '(') {
                            stack.push("(");
                        } else if(expression.charAt(i) == ')') {
                            if(stack.isEmpty()) {
                                return false;
                            }
                            stack.pop();
                        }
                    }

                    return stack.isEmpty();
        }

        public static void main(String[] args) {
        
            Scanner scan = new Scanner(System.in);
            String a = scan.nextLine();
            System.out.println(isBalanced(a));

        }

    }   

