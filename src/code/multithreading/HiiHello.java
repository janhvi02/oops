package code.multithreading;

public class HiiHello {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<=5;i++){
                    System.out.println("HII");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread t2=new Thread(()-> {                         //lambda only for functional interface
                for(int i=0;i<=5;i++){
                    System.out.println("HELLO");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("EXIT");

    }
}
