package linkedlist;



class Solution {
    public static ListNode deleteDuplicates(ListNode head) {

        ListNode node = head;
        while (node != null && node.next != null) {
            if (node.val == node.next.val) node.next = node.next.next;
            else {
                node = node.next;
            }
        }
        return head;


    }
    public int removeDuplicates(int[] nums) {

        int i = 0;
        int j = 0;
        return 0;

        


    }
    public static void main(String[] args){
        System.out.println("Namaste");

        ListNode node = new ListNode(1);

        node.next = new ListNode(1);
        node.next.next = new ListNode(2);
        node.next.next.next = new ListNode(2);
        node.next.next.next.next = new ListNode(3);
        node.next.next.next.next.next = new ListNode(4);
        node.next.next.next.next.next.next = new ListNode(4);
        node.next.next.next.next.next.next.next = new ListNode(5);
        node.next.next.next.next.next.next.next.next = new ListNode(5);
        node.next.next.next.next.next.next.next.next.next = new ListNode(5);

        ListNode results = deleteDuplicates(node);
        while (results != null) {
            System.out.print(results.val + " -> ");
            results = results.next;
        }

        System.out.println("null");

    }
}