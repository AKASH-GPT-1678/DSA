package linkedlist;

public class LinkedList {

    private Node head;
    private Node tail;

    public void insert(int num) {
        Node node = new Node(num);

        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        tail = node;
    }

    public void display() {
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;

        }
        System.out.println("null");

    }


    public Node getTail() {
        return tail;
    }


    public Node getHead() {
        return head;
    }
}
