package Arrays;

public class MyStackByArray {
    int top;
    int MAX = 100;
    int[] arr = new int[MAX];

    MyStackByArray() {
        top = 0;
    }

    boolean isEmpty() {
        if(top < 0) {
            System.out.println("Stack is empty");
            return true;
        }
        System.out.println("Not Empty!");
        return false;
    }

    void push(int x) {
        if(top >=  (MAX-1)) {
            System.out.println("Stack is overflow! Can't insert :(");
        }
        else {
            arr[top] = x;
            top++;
            System.out.println( " " + x + " is inserted into the stack");
        }
    }

    int pop() {
        if(top <= 0) {
            System.out.println("Stack is empty");
            return 0;
        }
        else {
            int x = arr[top];
            top--;
            System.out.println(" " + x + " is popped");
            return x;
        }
    }

    int peek() {
        if(top <= 0) {
            System.out.println("Stack is overflown!");
            return 0;
        }
        else {
            int x = arr[top];
            System.out.println(x + " at peek");
            return x;
        }
    }

    public static void main(String[] args) {
        MyStackByArray s = new MyStackByArray();
        s.push(1);
        s.peek();
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.pop();
        s.pop();
        s.isEmpty();
        s.peek();
    }
}
