package code.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Lambda {
    public static void main(String[] args) {
        MyInterface myInterface=()-> {
            System.out.println("in add");

        };
        myInterface.add();

        MyInterface2 myInterface2=( i,  j)-> System.out.println(i-j);
        myInterface2.sub(4,6);

        List<Integer> list= Arrays.asList(1,2,3,4);

        Consumer<Integer> consumer=new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        list.forEach(consumer);

        MyInterface33 myInterface33=()->"hello";                           //if multiple lines use return()
        System.out.println(myInterface33.msg());
    }

}
interface MyInterface{
    void add();
}
interface  MyInterface2{
    void sub(int i , int j);
}
interface MyInterface33{
    String msg();
}









