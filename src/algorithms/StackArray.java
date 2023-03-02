package algorithms;

public class StackArray {
    private int arr[];
    int capacity;
    int top;

    StackArray(int size){
        arr=new int[size];
        capacity=size;
        top=-1;
    }
    public boolean isFull(){
        return top==capacity-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public int peek(){
        if(!isEmpty()){
            return arr[top];
        }
        else{
            System.exit(1);
        }
        return -1;
    }
    public void push(int x){
        if(isFull()){
            System.out.println("STACK OVERFLOW");
            System.exit(1);
        }
        System.out.println("INSERTING ELEMENT =>"+x);
        arr[++top]=x;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("STACK UNDERFLOW");
            System.exit(1);
        }
        System.out.println("REMOVING ELEMENT=>"+peek());
        return arr[--top];
    }
    public int size(){
        return top+1;
    }

    public static void main(String[] args) {
        StackArray stack=new StackArray(3);
        stack.push(3);
        stack.push(5);
        stack.push(9);
        System.out.println("TOP ELEMENT IS=>"+stack.peek());
        System.out.println("STACK SIZE IS=>"+stack.size());
        stack.pop();
        stack.pop();

        if(stack.isEmpty()){
            System.out.println("THE STACK IS EMPTY");
        }
        else{
            System.out.println("THE STACK IS NOT EMPTY");
        }
    }
}
