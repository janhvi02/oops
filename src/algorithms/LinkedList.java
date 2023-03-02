package algorithms;

public class LinkedList {
    Node head;
    private int size;
    LinkedList(){
        this.size=0;
    }
    class Node{
        int data;
        Node next;

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

    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.printList();
    }


}
