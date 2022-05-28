public class DataStructureLinkedList {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void printList() {
        Node temp = head;
        if(temp == null) {
            System.out.println("The list is empty");
        }
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void addAtBeg(int d) {
        Node toAdd = new Node(d);
        toAdd.next = null;
        if(head == null) {
            head = toAdd;
            return;
        } else {
            toAdd.next = head;
            head = toAdd;
        }
    }

    void add(int d) {
        Node toAdd = new Node(d);
        if(head == null) {
            head = toAdd;
            return;
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = toAdd;
    }

    public int remove(int d) {
        Node temp = head;
        if(temp == null) {
            System.out.println("Cannot remove as list is empty");
            return 0;
        }
        if(temp.next == null) {
            Node toRemove = head;
            head = null;
            return toRemove.data;
        }
        while(temp.next.next != null) {
            temp = temp.next;
        }
        Node toRemove = temp.next;
        temp.next = null;
        return toRemove.data;
    }

    public static void main(String[] args) {
        DataStructureLinkedList l = new DataStructureLinkedList();
        l.add(3);
        System.out.println("Adding at beginning");
        l.addAtBeg(2);
        l.printList();
        l.addAtBeg(1);
        l.printList();
        System.out.println("Adding..");
        l.add(4);
        l.add(5);
        l.printList();
        System.out.println("Removing..");
        l.remove(5);
        l.printList();
    }
}
