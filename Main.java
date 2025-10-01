class Node {
    int data;
    Node next;
    static int count = 0;

    public Node(int data) {
        this.data = data;
        this.next = null;
        count++;
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("Namaste Digital");

        Node head = new Node(10);
        Node current = head;

        for (int i = 20; i <= 150; i += 10) {
            current.next = new Node(i);
            current = current.next;
        }

        current.next = new Node(1000);


      
    }

    

    static Node inserAtEnd(Node list, int val) {
        int count = 0;
        Node head = list;
        while (count < list.count) {
            if (head.next != null) {
                count++;
                head = head.next;
            } else {
                head.next = new Node(val);

            }

        }

        Node empNode = new Node(100);
        return empNode;

    }
}