public class StackUse {
    
 public static void main(String[] args) throws StackFullException, StackEmptyException {
    StackUsingArray stack = new StackUsingArray();

    for (int elem = 1; elem <= 20; elem++) {
        stack.push(elem);
    }

    while(!stack.isEmpty()) {

        try {
            System.out.println(stack.pop());
        } catch (StackEmptyException e) {
            // Never Reach Here
        }
    }
}

}
