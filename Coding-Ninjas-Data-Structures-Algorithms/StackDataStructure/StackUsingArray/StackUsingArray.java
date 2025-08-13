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
      
        return (top == -1);
    }

    public int size() {
        return top + 1;
    }

    public int top() throws StackEmptyException {
        if(size() == 0) {
            //StackEmptyException
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        return data[top];
    }

    public void push(int elem)  {

        if(size() == data.length) {
            resize();
        }
        top++;
        data[top] = elem;
    }

    public int pop() throws StackEmptyException  {

          if(size() == 0) {
            //StackEmptyException
            StackEmptyException e = new StackEmptyException();
            throw e;
        }

        int temp = data[top];
        top--;
       return temp;

    }
    private void resize() {
        int[] newData = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }
}
