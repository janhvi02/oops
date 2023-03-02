package algorithms;

public class ReverseLinkedList {
    Node head;
    private int size;
    ReverseLinkedList(){
        this.size=0;
    }
    class Node{
        int data;
        ReverseLinkedList.Node next;

        Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //add-first
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //add-last
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            System.out.println("LIST IS EMPTY");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    //print
    public void printList(){
        if(head==null){
            System.out.println("LIST IS EMPTY");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("null");

    }
    public void reverseIterate(){
        if(head==null || head.next==null){
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while (currNode.next!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;

            //update
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }

    public static void main(String[] args) {
        ReverseLinkedList list=new ReverseLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.printList();
        list.reverseIterate();
        list.printList();
    }
}
