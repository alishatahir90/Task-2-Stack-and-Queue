public class StackLinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node top = null;

    void push(int value) {
        Node n = new Node(value);
        n.next = top;
        top = n;
        System.out.println(value + " pushed");
    }

    void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(top.data + " popped");
            top = top.next;
        }
    }

    void display() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StackLinkedList s = new StackLinkedList();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.pop();
        s.display();
    }
}