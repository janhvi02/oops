package code.statickeyword;

import java.util.concurrent.Callable;

public class StaticKeyword {
    static final String CompanyName="xyz";
    int id;
    String name;

    static {
        System.out.println("IN STATIC");
        //CompanyName ="ABC";
    }

    public StaticKeyword(int id, String name) {
        this.id = id;
        this.name = name;
       // CompanyName = companyName;
    }

    public static void show(){
        System.out.println("IN STATIC SHOW");
    }

    public void display(){
        System.out.println("  id=> "+id+ "  name=> "+name+ "  company=> "+CompanyName );
    }

    public static void main(String[] args) {
        StaticKeyword obj = new StaticKeyword(8, "aditi");
        StaticKeyword obj1 = new StaticKeyword(0, "adi");
        StaticKeyword obj2 = new StaticKeyword(4, "aditya");
        obj.display();
        obj1.display();
        obj2.display();
        show();
    }
}
