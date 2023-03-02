package code.multithreading;

public class SynchronizedDemo {
    int num;

    public synchronized void increase(){
        num++;
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedDemo obj=new SynchronizedDemo();

        Thread t1=new Thread(()->{
                for(int i=1;i<=1000;i++){
                    obj.increase();
                }
        });
        Thread t2=new Thread(()->{
                for(int i=1;i<=1000;i++){
                    obj.increase();
            }
        });
        t2.start();
        t1.start();
        t2.join();
        t1.join();
        System.out.println(obj.num);
    }
}
