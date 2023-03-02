package com.learning;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class LEARN {
   // public static void main(String[] args) {
   // }
    //public static void main() throws IOException {
public static void main(String[] args)
{

    Scanner scan = new Scanner(System.in);
    System.out.println("1.Enter radius of circle: ");
    System.out.println("2.Enter side of rectangle");
    System.out.println("3.Enter side of square");
    System.out.println("\nENTER YOUR CHOICE:");
    switch(scan.nextInt())
    {
        case 1:
            System.out.println("ENTER RADIUS OF CIRCLE:");
            double rad=scan.nextDouble();
            double area=Math.PI*rad*rad;
            System.out.println("area of circle:"+area);
            break;
        case 2:
            System.out.println("ENTER THE LENGTH OF RECTANGLE");
            double len=scan.nextDouble();
            System.out.println("ENTER THE BREADTH OF RECTANGLE");
            double bredth=scan.nextDouble();
            System.out.println("THE AREA OF RECTANGLE IS:"+len*bredth);
            break;
        case 3:
            System.out.println("ENTER SIDE OF SQUARE");
            double side=scan.nextDouble();
            System.out.println("THE AREA IS"+4*side);
            break;
        default:
            System.out.println("INVALID CHOICE");

    }

    scan.close();

}
}



