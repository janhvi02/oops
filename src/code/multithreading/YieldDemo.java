package code.multithreading;

public class YieldDemo extends Thread{
    public void run(){
        Thread.yield();
        //it stops the current threads execution
        //and gives chance to another thread for execution
        for(int i=0;i<=5;i++){
            System.out.println("IN RUN METHOD");
        }
    }

    public static void main(String[] args) {
        YieldDemo obj=new YieldDemo();
        obj.start();

        for(int i=0;i<=5;i++){
            System.out.println("IN MAIN METHOD");
        }
    }

}
