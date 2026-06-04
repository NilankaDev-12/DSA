class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class QueueLinkedList {
    int MAX = 10;
    int count = 0;

    Node head; // Front
    Node tail; // Rear

    public void insert(int data) {

        if (count == MAX) {
            System.out.println("Queue Overflow");
            return;
        }

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        count++;
    }

    public void delete() {

        if (head == null) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("Deleted: " + head.data);

        head = head.next;

        if (head == null) {
            tail = null;
        }

        count--;
    }

    public void peek() {

        if (head == null) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Front Element: " + head.data);
    }

    public void display() {

        if (head == null) {
            System.out.println("Queue is Empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

class QueueArray {

    int MAX = 10;

    int[] arr = new int[MAX];

    int front = -1;
    int rear = -1;

    public void insert(int data) {

        if (rear == MAX - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear++;
        arr[rear] = data;
    }

    public void delete() {

        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("Deleted: " + arr[front]);

        front++;

        if (front > rear) {
            front = rear = -1;
        }
    }

    public void peek() {

        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Front Element: " + arr[front]);
    }

    public void display() {

        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}

public class Q9_Queue {

    public static void main(String[] args) {

        System.out.println("Linked List Queue");

        QueueLinkedList q1 = new QueueLinkedList();

        q1.insert(10);
        q1.insert(20);
        q1.insert(30);

        q1.display();

        q1.delete();

        q1.display();

        q1.peek();

        System.out.println("\nArray Queue");

        QueueArray q2 = new QueueArray();

        q2.insert(100);
        q2.insert(200);
        q2.insert(300);

        q2.display();

        q2.delete();

        q2.display();

        q2.peek();
    }
}