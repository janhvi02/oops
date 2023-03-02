/**Create a Java class named Triangle that represents a "triangle"
 with the following characteristics:
 1) The class has three private integer instance variables
 (S1, S2, S3) to store the sides of the triangle.

 2) This class has two constructors: Constructor #1 - has no parameters and initializes the  triangle's sides to 0 Constructor #2 - has three integer parameters that initializes the triangle's sides

 3) This class has a method calculatePerimeter( ) which returns the perimeter (s1+s2+s3) o
 *
 */
package seit;

public class Triangle {
    int s1;
    int s2;
    int s3;

    Triangle() {                           //default constructor

        System.out.println();
    }

    public Triangle(int s1, int s2, int s3) {          //parameterized constructor
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    void calculatePerimeter() {                        //addition
        System.out.println(s1 + s2 + s3);
    }


    public static void main(String[] args) {
        Triangle triangle = new Triangle(10,5,2);
        System.out.println("THE PERIMETER OF TRIANGLE IS=>");
        triangle.calculatePerimeter();

    }
}


/**
 * public void show(){
 *         Scanner scan=new Scanner(System.in);
 *         System.out.println("ENTER 1ST SIDE");
 *         s1= scan.nextInt();
 *         System.out.println("ENTER 2ND SIDE");
 *         s2= scan.nextInt();
 *         System.out.println("ENTER 3RD SIDE");
 *         s3= scan.nextInt();
 *
 *     }
 */