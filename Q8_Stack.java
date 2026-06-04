class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Linked List implementation
class Stack {
    int MAX = 10, count = 0;
    Node head = null;

    public void insert(int data) {
        if (count == MAX) {
            System.out.println("Stack is full");
            return;
        }

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            count++;
            return;
        }

        newNode.next = head;
        head = newNode;
        count++;
    }

    public void delete() {
        if (count == 0 || head == null) {
            System.out.println("Stack is empty");
            return;
        }

        head = head.next;
        count--;
    }

    public void display() {
        if (head == null || count == 0) {
            System.out.println("Stack is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}

// Array implementation
class Stack_Array {
    int MAX = 10;
    int top = -1;
    int arr[] = new int[MAX];

    public void insert(int data) {
        if (top == MAX - 1) {
            System.out.println("Stack is full");
            return;
        }

        arr[++top] = data;
    }

    public void delete() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        top--;
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " -> ");
        }
        System.out.println("null");
    }
}

public class Q8_Stack {
    public static void main(String args[]) {
        Stack stack = new Stack();

        stack.insert(10);
        stack.insert(20);
        stack.insert(30);
        stack.insert(40);
        stack.insert(50);
        stack.insert(60);

        stack.display();

        stack.delete();
        stack.delete();

        stack.display();

        Stack_Array stack_array = new Stack_Array();

        stack_array.insert(10);
        stack_array.insert(20);
        stack_array.insert(30);
        stack_array.insert(40);
        stack_array.insert(50);
        stack_array.insert(60);

        stack_array.display();

        stack_array.delete();
        stack_array.delete();

        stack_array.display();
    }
}