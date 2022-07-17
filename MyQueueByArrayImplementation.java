package Arrays;

public class MyQueueByArrayImplementation {
    public static void main(String[] args) {
        MyQueueByArray q = new MyQueueByArray(4);
        q.queueDisplay();
        q.queueEnqueue(1);
        q.queueEnqueue(2);
        q.queueEnqueue(3);
        q.queueEnqueue(4);
        q.queueEnqueue(5);
        q.queueDisplay();
        q.queueEnqueue(6);
        q.queueDisplay();
        q.queueDequeue();
        q.queueDequeue();
        System.out.println("After deletion : ");
        q.queueDisplay();
        q.queueFront();
    }
}
