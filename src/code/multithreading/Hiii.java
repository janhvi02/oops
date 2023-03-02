package code.multithreading;


public class Hiii extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("HII");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class hello implements Runnable{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("HELLO");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Multithreading{
    public static void main(String[] args) throws InterruptedException {
        Hiii hii=new Hiii();
        hii.start();

        hello hello=new hello();
        Thread t1=new Thread(hello);
        t1.start();
    }
}