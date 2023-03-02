package code.java8;

public class MethodRefToStatic {
    public static void main(String[] args) {
        MyInterface5 myInterface5 =MethodRefToStatic::display;
        System.out.println(myInterface5.msg());
    }
    public static String display(){
        return "hello";
    }
}
interface MyInterface5{
    String msg();
}
// count the number of 0's and 1's