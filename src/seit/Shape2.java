package seit;
import java.util.*;
public class Shape2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        EquilateralTriangle t=new EquilateralTriangle();
        Rectangle r=new Rectangle();
        System.out.println("ENTER YOUR CHOICE");
        System.out.println("1.For finding area of Equilateral Triangle\n 2.For finding area of Rectangle\n");
        int choice = scan.nextInt();
        switch (choice){
            case 1:
                t.input();
                t.compute_area();
                break;
            case 2:
                r.input();
                r.compute_area();
                break;
            default:
                System.out.println("INVALID CHOICE!!\nTRY AGAIN");
        }


    }

}
