package code.switchcase;
import java.util.*;
public class SwitchCase {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        num= scan.nextInt();
        switch (num){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;

            default:{
                System.out.println("invalid");
            }
        }
    }
}
