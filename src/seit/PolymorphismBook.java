/**Identify commonalities and differences between Publication, Book and Magazine classes. Title,
 Price, Copies are common instance variables and saleCopy is common method. The differences
 are, Book class has author and orderCopies(). Magazine Class has methods orderQty, Current issue,
 receive issue(). Write a program to find how many copies of the given books are ordered and
 display total sale of publication.
 *
 */
package seit;
import java.util.*;
class Publication{
    String title;
    int copies,price;
    void saleCopy(){

    }
}
class Book{
    Scanner scan=new Scanner(System.in);
    String title;
    int copies,price;
    void saleCopy(){
        System.out.println("ENTER PRICE OF BOOK");
        price= scan.nextInt();
        System.out.println("TOTAL SALE-> "+copies*price);

    }
    void orderCopies(){
        System.out.println("ENTER NUMBER OF COPIES");
        copies=scan.nextInt();
    }
}
class Magazine{
    String title;
    int copies,price;
    void saleCopy(){

    }
    void orderQty(){

    }
    void currentIssue(){

    }
    void receiveIssue(){
    }
}

public class PolymorphismBook {
    public static void main(String[] args) {
        Book b=new Book();
        b.orderCopies();
        b.saleCopy();
    }
}
