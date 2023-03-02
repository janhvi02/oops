package com.learning;
import java.util.*;

public class Main {
    Node head;
    private int size;

    Main(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //add-first,last
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //add-last
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    //print
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    //delete-first
    public void deleteFirst(){
        if(head==null){
            System.out.println("THE LIST IS EMPTY");
        }
        size--;
        head=head.next;
    }

    //delete-last
    public void deleteLast(){
        if(head==null){
            System.out.println("THE LIST IS EMPTY");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondlast=head;
        Node lastnode=head.next;
        while(lastnode.next!=null){
            lastnode=lastnode.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
    }
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        Main list=new Main();
        list.addFirst("a");
        list.addFirst("is");
       list.printList();

       list.addLast("list");
       list.printList();

       list.addFirst("this");
       list.printList();

       list.deleteFirst();
       list.printList();

       list.deleteLast();
       list.printList();

        System.out.println( list.getSize());
        list.addFirst("this");
        System.out.println( list.getSize());


    }
}






