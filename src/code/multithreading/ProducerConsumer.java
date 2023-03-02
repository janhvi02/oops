package code.multithreading;

public class ProducerConsumer {
    int num;
    boolean flag=true;
    public synchronized void set(int num){
        this.num=num;
        System.out.println("set->"+this.num);
    }
    public void get(){
        System.out.println("get->"+this.num);
    }
}
class Producer implements Runnable{
    ProducerConsumer producerConsumer;
    Producer(ProducerConsumer producerConsumer){
        this.producerConsumer=producerConsumer;
        Thread t1=new Thread(this);
        t1.start();
    }

    @Override
    public void run() {
        int i=0;
        while(true){
            producerConsumer.set(i++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Consumer implements Runnable {
    ProducerConsumer producerConsumer;

    Consumer(ProducerConsumer producerConsumer) {
        this.producerConsumer = producerConsumer;
        Thread t2 = new Thread(this);
        t2.start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            producerConsumer.get();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class main{

    public static void main(String[] args) {
       ProducerConsumer producerConsumer=new ProducerConsumer();
       Producer producer=new Producer(producerConsumer);
       Consumer consumer=new Consumer(producerConsumer);
    }
}
