package code.java8;

import java.util.ArrayList;
import java.util.List;

public class MethodReferencesDemo {
    public static void main(String[] args) {
        //method references to instance method
        MethodReferencesDemo obj=new MethodReferencesDemo();
        MyInterface3 myInterface3=obj::display;
        System.out.println(myInterface3.msg());
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(12);
        list.add(22);
        list.forEach(System.out::println);
    }
    public String display(){
        return "hii";
    }
}
@FunctionalInterface
interface MyInterface3{
    String msg();
}
//1.default static in interface
// 2.rules for functional interfaces
// 3.pvt methods in interfaces
// 4.use of pvt interfaces