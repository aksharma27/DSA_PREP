package Contests.POTD;

import java.util.List;

public class PartitionList {
    static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode partition(ListNode head, int x) {
            ListNode leftPart = new ListNode();
            ListNode rightPart = new ListNode();
            ListNode ltail = leftPart;
            ListNode rtail = rightPart;
            while (head != null) {
                if (head.val < x) {
                    ltail.next = head;
                    ltail = ltail.next;
                } else {
                    rtail.next = head;
                    rtail = rtail.next;
                }
                head = head.next;
            }
            ltail.next = rightPart.next;
            rtail.next = null;
            return leftPart.next;
    }
    static void display (ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "-> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
//        1,4,3,2,5,2
        ListNode head = new ListNode(1);
        ListNode one = new ListNode(4);
        ListNode two = new ListNode(3);
        ListNode three = new ListNode(2);
        ListNode four = new ListNode(5);
        ListNode five = new ListNode(2);  head.next = one; one.next = two; two.next = three; three.next = four; four.next = five;
        ListNode newHead = partition(head, 3);
        display(newHead);
    }
}
