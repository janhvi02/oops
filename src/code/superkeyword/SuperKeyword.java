package code.superkeyword;
//1.refer the immediate parent class
//2.refer the immediate parent class method
//3.refer  the immediate parent constructor
public class SuperKeyword {
    int i = 87;

    public void show(){
        System.out.println("IN SUPER DEMO SHOW");
    }
    public SuperKeyword(){//
        System.out.println("IN SUPER KEYWORD CONSTRUCTOR");
    }
    public SuperKeyword(int i){
        System.out.println("IN SUPER KEYWORD PARAMETER");
    }
}

class b extends SuperKeyword{
    int i =90;

    public void show(){
        super.show();
        System.out.println("i=>" + super.i);
        System.out.println("i=>"+i);
    }

    public b(){//
        System.out.println("IN B CONSTRUCTOR");
    }
    public b(int i){
        super(i);
        System.out.println("IN B PARAMETER CONSTRUCTOR");
    }

    public static void main(String[] args) {
        b obj= new b(8);
       // obj.show();

    }
}
// variable , method , constructor
// super 1st statement of the constructor