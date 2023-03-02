package seit;
import java.util.*;
public class ConstructorDemo {
  int adharno;
  String panno;
  String name;

  ConstructorDemo(int adharno, String panno, String name) {
    this.adharno = adharno;
    this.panno = panno;
    this.name = name;

  }

  ConstructorDemo(int adharno, String name) {
    this.adharno = adharno;
    this.name = name;
    this.panno = "NON VALID";
  }
  ConstructorDemo(){
    System.out.println("DEFAULT CONSTRUCTOR ");
  }
  void display(){
    System.out.println("ADHAR NO."+adharno);
    System.out.println("PAN NO."+panno);
    System.out.println("NAME"+name);
  }
}


class Test extends ConstructorDemo{
  public static void main(String[] args) {
    ConstructorDemo c1,c2,c3;
    String panno,name;
    int adharno;
    Scanner scan=new Scanner(System.in);
    System.out.println("ENTER THE DETAILS OF FIRST PERSON");
    System.out.println("ENTER ADHAR NUMBER");
    adharno=scan.nextInt();
    System.out.println("ENTER PAN NUMBER");
    panno=scan.next();
    System.out.println("ENTER NAME");
    name=scan.next();
    c1=new ConstructorDemo(adharno,panno,name);
    c1.display();

    System.out.println("ENTER THE DETAILS OF SECOND PERSON");
    System.out.println("ENTER ADHAR NUMBER");
    adharno=scan.nextInt();
    System.out.println("ENTER PAN NUMBER");
    panno=scan.next();
    System.out.println("ENTER NAME");
    name=scan.next();
    c2=new ConstructorDemo(adharno,name);
    c2.display();

    System.out.println("ENTER THE DETAILS OF SECOND PERSON");
    System.out.println("ENTER ADHAR NUMBER");
    adharno=scan.nextInt();
    System.out.println("ENTER PAN NUMBER");
    panno=scan.next();
    System.out.println("ENTER NAME");
    name=scan.next();
    c3=new ConstructorDemo(adharno,name);
    c3.display();



  }
}
