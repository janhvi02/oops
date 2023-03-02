/**
 *Design a program :- The user enters two numbers Num1 and Num2.
 * The division of Num1 and Num2 is displayed. If Num1 and Num2 are
 * not integers, the program would throw a Number Format Exception. If
 * Num2 were zero, the program would throw an Arithmetic Exception.
 */
package seit;
import java.util.*;
public class ExceptionDemo {
    public static void number(){
        Scanner scan=new Scanner(System.in);
        try{
            int num1,num2;
            int division;
            System.out.println("enter num1");
            num1=scan.nextInt();
            System.out.println("enter num2");
            num2= scan.nextInt();
            division=num1/num2;
            System.out.println("DIVISION "+division);
        }catch (NumberFormatException e){
            System.out.println("NumberFormatException");
        }finally {
            System.out.println("method number:finally");
        }
    }
    public static void main(String[] args) {
        try{
            System.out.println("CALLING NUMBER");
            number();
            System.out.println("return from method number");
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }finally {
            System.out.println("main:finally");
        }
    }
}
