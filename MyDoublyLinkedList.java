public class MyDoublyLinkedList {
    Node head;
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int d) {
            data = d;
        }
    }

    public void push(int new_data)
    {
        Node new_Node = new Node(new_data);   //making of new node
        new_Node.next = head;
        new_Node.prev = null;
        if (head != null) {
            head.prev = new_Node;      //if list is empty
        }
        head = new_Node;
    }

    public void InsertAfter(Node prev_Node, int new_data)   //insert after a particular node
    {

        if (prev_Node == null) {
            System.out.println("The given previous node cannot be NULL ");    //not possible to insert
            return;
        }
        Node new_node = new Node(new_data);  //creating new node

        new_node.next = prev_Node.next;

        prev_Node.next = new_node;

        new_node.prev = prev_Node;

        if (new_node.next != null)
            new_node.next.prev = new_node;
    }

    void append(int new_data)   //add a new node at last
    {
        Node new_node = new Node(new_data);
        Node last = head;
        new_node.next = null;
        if (head == null) {    //if list is empty
            new_node.prev = null;
            head = new_node;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;
        new_node.prev = last;
    }

    public void printlist(Node node)
    {
        Node last = null;
        System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }

    public static void main(String[] args) {
        MyDoublyLinkedList dll = new MyDoublyLinkedList();
        dll.append(5);
        dll.push(6);
        dll.push(1);
        dll.append(3);
        dll.InsertAfter(dll.head.next, 7);
        System.out.println("Created doubly linked list is: ");
        dll.printlist(dll.head);
    }
}
