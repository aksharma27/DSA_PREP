package Test;

public class linkedlist1 {

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        public Node() {
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    static Node tail;
    static int size;

    void addfirst(int data){
        Node n1=new Node(data);
        size++;
//        if(head==null){
//            head=tail=null;
//            return;
//        }
        n1.next=head;
        head=n1;
    }

    void addlast(int data){
        Node n1=new Node(data);
        size++;
        Node temp=head;
        size++;
        if(head==null){
            head=tail=n1;
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp=n1;
    }

    void addmiddle(int data,int k){
        Node n1=new Node(data);
        size++;
        Node temp=head;
        if(head==null){
            head=tail=n1;
            return;
        }
        for(int i=1;i<k-1;i++){
            temp=temp.next;
        }
        Node temp2=temp.next;
        temp.next=n1;
        n1.next=temp2;
    }

    void removefirst(){
        size--;
        head=head.next;
    }

    void removetail(){
        size--;
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

    void delmiddle(int pos){
        size--;
        Node temp=head;
        if(head==null){
            return;
        }
        if(pos==0){
            return;
        }
        for(int i=0;temp!=null && i<pos-1;i++){
            temp=temp.next;
        }
        while(temp==null || temp.next==null){
            return;
        }
        Node next1=temp.next.next;
        temp.next=next1;
    }


    void show(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"---->");
            temp=temp.next;

        }
        System.out.println();
    }

    public static void main(String[] args) {
        linkedlist1 ll=new linkedlist1();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(3);
        ll.show();


        System.out.println("size of linkedlist:"+ll.size);



    }
}