package Arrays;

public class MyQueueByArray {
    private static int front, rear, capacity;
    private static int queue[];
    MyQueueByArray(int n) {
        front = rear = 0;
        capacity = n;
        queue = new int[capacity];
    }

    static void queueEnqueue(int data) {
        if(capacity == rear) {
            System.out.println("Queue is full!");
            return;
        }
        else {
            queue[rear] = data;
            rear++;
        }
        return;
    }

    static void queueDequeue() {
        if(front == rear) {
            System.out.println("Queue is empty!");
            return;
        }
        else {
            for(int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i+1];
            }
            if(rear < capacity) {
                queue[rear] = 0;
            }
            rear--;
        }
        return;
    }

    static void queueDisplay() {
        if(front == rear) {
            System.out.println("Queue is empty!");
            return;
        }
        for(int i = front; i < rear; i++) {
            System.out.println(queue[i] + " ");
        }
        return;
    }

    static void queueFront() {
        if(front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Front element is : " + queue[front]);
        return;
    }
}
