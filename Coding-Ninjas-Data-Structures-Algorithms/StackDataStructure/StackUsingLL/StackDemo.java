public class Stack {
    private Node head;  // top of the stack
    private int size;   // track number of elements

    public Stack() {
      head = null;
     size = 0;

    }

    public int getSize() { 
        return size;
    }

    public boolean isEmpty() {
  
        return(head==null);
    }

    public void push(int element) {
   
        Node NewNode = new Node(element);
        NewNode.next = head;
        head = NewNode;
        size++;
    }

    public int  pop() {
        if(isEmpty()) {
            return -1;
        }
        int poppedData = head.data;
        head = head.next;
        size--;
        return poppedData;

    }

    public int top () {
        if(isEmpty()) {
            return -1;
        }
        return head.data;
    }
}