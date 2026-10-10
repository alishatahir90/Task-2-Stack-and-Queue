public class QueueArray {
    int[] queue = new int[5];
    int front = 0;
    int rear = -1;
    int size = 0;

    void enqueue(int value) {
        if (size == queue.length) {
            System.out.println("Queue Overflow");
        } else {
            rear = (rear + 1) % queue.length;
            queue[rear] = value;
            size++;
            System.out.println(value + " inserted");
        }
    }

    void dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(queue[front] + " removed");
            front = (front + 1) % queue.length;
            size--;
        }
    }

    void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(queue[(front + i) % queue.length]);
        }
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
    }
}