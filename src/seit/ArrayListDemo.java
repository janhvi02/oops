package seit;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
import java.io.*;
public class ArrayListDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("PROGRAM FOR IMPLEMANTATION OF ARRAY LIST");
        ArrayList<Character> obj=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        char ans;
        do {
            System.out.println("MAIN MENU");
            System.out.println("\n 1.CREATE \n 2.DISPLAY \n 3.INSERT" +
                    " \n 4.DELETE \n 5.MODIFY");
            System.out.println("ENTER YOUR CHOICE");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("INSERTING SOME ELEMENTS IN ARRAY");
                    System.out.println("ENTER HOW MANY ELEMENTS ");
                    int n = scan.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("ENTER CHARACTER");
                        char ch = scan.next().charAt(0);
                        if (Character.isDigit(ch))
                            throw new IOException("INVALID CHARACTER");
                        else {
                            obj.add(ch);
                        }

                    }
                    break;
                case 2:
                    System.out.println("THE ARRAY SIZE IS-> " + obj.size());
                    System.out.println("THE ELEMENTS ARE-> " + obj);
                    break;

                case 3:
                    System.out.println("INSERT ELEMENT IN BETWEEN");
                    System.out.println("ENTER THE INDEX YOU WANT TO INSERT ELEMENT");
                    int i = scan.nextInt();
                    System.out.println("ENTER CHARACTER");
                    char ch = scan.next().charAt(0);
                    if (Character.isDigit(ch))
                        throw new IOException("INVALID CHARACTER");
                    else {
                        obj.add(i, ch);
                    }
                    break;
                case 4:
                    System.out.println("REMOVING SOME ELEMENT FROM ARRAY");
                    System.out.println("ENTER INDEX YOU WANT TO REMOVE");
                    int m = scan.nextInt();
                    obj.remove(m);
                    break;
                case 5:
                    System.out.println("UPDATING SOME ELEMENT IN ARRAY");
                    System.out.println("ENTER THE INDEX AT WHICH YOU WANT TO MODIFY CHARACTER");
                    i = scan.nextInt();
                    System.out.println("ENTER CHARACTER");
                    ch = scan.next().charAt(0);
                    if (Character.isDigit(ch))
                        throw new IOException("INVALID CHARACTER");
                    else {
                        obj.set(i, ch);
                    }
                    break;
            }
            System.out.println("DO YOU WANT TO GO BACK TO MENU Y/N?");
            ans = scan.next().charAt(0);
        }while(ans=='Y' || ans=='y');

    }

}
