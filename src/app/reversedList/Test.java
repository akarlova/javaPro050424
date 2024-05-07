package app.reversedList;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        ListNode reverseHead = ListNode.reverseList(convertListToLinkedList(list));
        printLinkedList(reverseHead);

    }

    private static ListNode convertListToLinkedList(LinkedList<Integer> list) {
        ListNode head = new ListNode(0);
        ListNode curr = head;

        for (Integer num : list) {
            curr.next = new ListNode(num);
            curr = curr.next;
        }

        return head.next;
    }

    private static void printLinkedList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

}
