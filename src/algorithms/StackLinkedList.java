package algorithms;
public class StackLinkedList {
    Node head;
        class Node{
            int data;
            Node link;
        }
        Node top;
        StackLinkedList(){
            this.top=null;
        }
        public void push(int x){
            Node temp=new Node();
            if(temp==null){
                System.out.println("OVERFLOW");
            }else{
                temp.data=x;
                temp.link=top;
                top=temp;
            }
        }
        public boolean isEmpty(){
            return top==null;
        }
        public void pop(){
            if(top==null){
                System.out.println("UNDER FLOW");
            }else{
                top=(top).link;
            }
        }
        public int peek(){
            if(!isEmpty()){
                return top.data;
            }else{
                System.out.println("IS EMPTY");
            }return -1;
        }

    public static void main(String[] args) {

    }
}
