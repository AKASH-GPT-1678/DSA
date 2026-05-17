package linkedlist;

public class Link {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insert(100);
        list.insert(200);
        list.insert(300);
        list.display();
        System.out.println(list.getTail().value);
        System.out.println(list.getHead().value);

    }
}
