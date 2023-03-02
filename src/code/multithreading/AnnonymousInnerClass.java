package code.multithreading;

public class AnnonymousInnerClass {
    public static void main(String[] args) {
        MyInterface myInterface=new MyInterface() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };
        System.out.println(myInterface.add(2,4));

                                        //////////lambda///////////



        MyInterface myInterface1=(int a, int b)-> {
                return a+b;
        };
        System.out.println(myInterface1.add(8,0));
    }
    interface MyInterface{
        int add(int a,int b);
    }
}
