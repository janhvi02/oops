package code.java8;

public class MethodRefToConstructor {
    public static void main(String[] args) {

        MyInterface4 myInterface4=MyClass::new;
        myInterface4.MyRef();
    }
}
class MyClass{
    MyClass(){
        System.out.println("IN MY CLASS");
    }
}
interface MyInterface4{
    MyClass MyRef();
}
