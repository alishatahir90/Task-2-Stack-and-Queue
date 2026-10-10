public class QueueLinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node front = null;
    Node rear = null;

    void enqueue(int value) {
        Node n = new Node(value);

        if (rear == null) {
            front = rear = n;
        } else {
            rear.next = n;
            rear = n;
        }
        System.out.println(value + " inserted");
    }

    void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(front.data + " removed");
            front = front.next;

            if (front == null) {
                rear = null;
            }
        }
    }

    void display() {
        Node temp = front;
        if (temp == null) {
            System.out.println("Queue is empty");
            return;
        }

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
    }
}