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
        return head == null;
    }

    public void push(int element) {
        Node newNode = new Node(element);
        newNode.next = head; // link new node to old top
        head = newNode;      // update top
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            return -1; // stack underflow
        }
        int poppedData = head.data;
        head = head.next; // move top pointer
        size--;
        return poppedData;
    }

    public int top() {
        if (isEmpty()) {
            return -1; // stack empty
        }
        return head.data;
    }
}