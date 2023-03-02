package code.polymorphism;

public class PolyDemo {

    public int add(int a,int b){

        return a+b;
    }
    public int add(int a , int b ,int c){

        return a+b+c;
    }
    public double add(double a , int b , int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        PolyDemo addition = new PolyDemo();
        System.out.println(addition.add(2,4));
        System.out.println(addition.add(6.9,6,7));
    }
}
/**
 * method overloading rule -> 1. change parameter or datatype
 * compile time polymorphism , static binding , early binding
 * method overloading-> a class have multiple methods with same name but different number of arguments
 */
