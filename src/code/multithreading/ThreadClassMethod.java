package code.multithreading;

public class ThreadClassMethod {

    public static void main(String[] args) {
        Thread t1= new Thread(()-> {
            System.out.println(Thread.currentThread().isAlive());
                System.out.println("in run");
        });
        t1.setName("FIRST THREAD");
        System.out.println(t1.getName());



        Thread t2= new Thread(()-> {
                System.out.println("in 1st run");
        });
        t2.setName("SECOND THREAD");
        System.out.println(t2.getName());

        System.out.println(t2.getId());
        System.out.println(t2.getPriority());
        System.out.println(t1.isDaemon());
        t1.start();
        // System.out.println(t1.isAlive());
    }
}
