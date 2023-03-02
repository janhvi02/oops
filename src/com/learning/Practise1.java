package com.learning;

import java.util.Iterator;
import java.util.Scanner;

public class Practise1 {


    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
       int choice;
       float a,s,p,q,x,y;
       double area;
        System.out.println("1,AREA OF EQUILATERAL TRIANGLE");
        System.out.println("2.AREA OF ISOSCELES TRIANGLE");
        System.out.println("3.AREA OF SCALENE TRIANGLE");

        choice=scan.nextInt();
        switch(choice){
            case 1:
                System.out.println("ENTER SIDE OF TRIANGLE");
                s= (float) scan.nextDouble();
                area=Math.sqrt(3*s*s)/4;
                System.out.println("AREA"+area);
                break;
            case 2:
                System.out.println("ENTER THE SIDE ");
                a= scan.nextFloat();
                System.out.println("ENTER BASE ");
                x= scan.nextFloat();
                area=x/4*(Math.sqrt(4*a*a-x*x));
                System.out.println("AREA"+area);
                break;
            case 3:
                System.out.println("ENTER ALL SIDES OF TRIANGLE");
                s= scan.nextFloat();
                p= scan.nextFloat();
                q= scan.nextFloat();

        }
    }
}
