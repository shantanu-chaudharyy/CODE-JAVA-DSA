public class StackUsingArray {

  private int data[];
  private int top;

    public StackUsingArray() {
        data = new int[10];
        top = -1;
    }

    public StackUsingArray(int capacity) {
        data = new int[capacity]; 
        top = -1;
    }

    public boolean isEmpty() {
       if(top == -1) {
        return true;
       } 
    }
}
