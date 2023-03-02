package seit;
import java.util.*;
public class BookShop {
    String book_title;
    String author_name;
    int price;
    int current_stock;

    BookShop() {
        System.out.println("DEFAULT CONSTRUCTOR");
    }

    BookShop(String Book_Title, String Author_Name, int price, int Current_Stock) {
        this.book_title = Book_Title;
        this.author_name = Author_Name;
        this.price = price;
        this.current_stock = Current_Stock;
    }

    String get_Title() {
        return book_title;

    }

    String get_author() {
        return author_name;
    }

    void display() {
        System.out.println(book_title + "\t" + author_name + "\t" + price + "\t" + current_stock + "\t");
    }

    void update() {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER NEW STOCK VALUE");
        int new_stock = scan.nextInt();
        current_stock = new_stock;
    }

    class BookDetails extends BookShop {
        public static void main(String[] args) {
            BookShop b[] = new BookShop[3];
            b[0] = new BookShop("aaa\t", "xxx\t", 29, 10);
            b[1] = new BookShop("bbb\t", "yyy\t", 54, 76);
            b[2] = new BookShop("ccc\t", "zzz\t", 32, 76);
            System.out.println("\t\tBooks Records");
            System.out.println("title\tauthor\tprice stock");
            for (int i = 0; i < b.length; i++) {
                b[i].display();
            }
            /////Query to search book by book title////////
            Scanner scan = new Scanner(System.in);
            System.out.println("\nEnter the title of book for searching in record");
            String title = scan.next();
            for (int i = 0; i < b.length; i++) {
                if (title.equals(b[i].get_Title())) {
                    System.out.println("The given book is present");
                    System.out.println("title\nauthor\nprice\nstock");
                    b[i].display();
                    break;
                }
            }
            ////////////Query to search by author name/////////
            System.out.println("\n Enter the name of the author for searching");
            String name = scan.next();
            for (int i = 0; i < b.length; i++) {
                if (name.equals(b[i].get_author())) {
                    System.out.println("The given book is present");
                    System.out.println("title\nauthor\nprice\nstock");
                    b[i].display();
                    break;
                }
            }
            //////Updating the stock on purchase///////
            System.out.println("\nEnter title of book for updating the stock");
            String title1 = scan.next();
            for (int i = 0; i < b.length; i++) {
                if (title1.equals(b[i].get_Title())) {
                    b[i].update();
                    break;
                }
            }
            ////////Displaying the records after updation///////
            System.out.println("\n\t\tBooks Records");
            System.out.println("Title\tAuthor\tPrice\tStock");
            for (int i = 0; i < b.length; i++) {
                b[i].display();
            }
        }
    }
}
