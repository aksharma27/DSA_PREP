package MOCKINTERVIEW;

public class SortDoublyList {
    static class Node {
        int data;
        Node next;
        Node prev;
        public Node (int data) {
            this.next = null;
            this.data = data;
            this.prev = null;
        }
    }

    static Node head;

    public static void main(String[] args) {
        head = new Node(3);
        Node sx = new Node(6);
        Node tw = new Node(2);
        Node tlv = new Node(12);
        Node fvsx = new Node(56);
        Node et = new Node(8);


        head.next = sx; sx.prev = head;
        sx.next = tw;   tw.prev = sx;
        tw.next = tlv;  tlv.prev = tw;
        tlv.next = fvsx;    fvsx.prev = tlv;
        fvsx.next = et;     et.prev = fvsx;

        Node hd = sort(head, 2);
        while (hd != null) {
            System.out.print(hd.data + "-> ");
            hd = hd.next;
        }
    }
//2->3->6->12->56->8
    static Node sort (Node head, int k) {
        Node temp = head;
        int count = 0;
        Node newHead = null;
        while (temp != null) {
            Node curr = temp.next; count++;     //next element so increasing count val
            while (curr != temp && count <= k) {
                if (curr.data > temp.data) {
                    curr = curr.next;
                    if (temp.prev == null) newHead = temp;
                    count++;
                }
                else if (curr.data < temp.data) {
                    int val = curr.data;
                    curr.data = temp.data;
                    temp.data = val;
                    if (temp.prev == null) newHead = temp;
                    temp = temp.next;
                }
            }
            count = 0;
            temp = temp.next;

//            if (temp.prev == null) {
//                if (temp.next.data > temp.data) temp = temp.next;
//            }
        }
        return newHead;
    }
}
