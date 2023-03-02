package seit;
import java.util.*;
abstract class Shape {
    double length;
    double width;
    Scanner scan = new Scanner(System.in);
   public abstract  void input();

   public abstract void compute_area();
}

class EquilateralTriangle extends Shape{
    @Override
    public void input() {
        System.out.println("ENTER THE LENGTH OF TRIANGLE");
        length = scan.nextDouble();
    }

    @Override
    public void compute_area() {
        double tArea=(1.732/4)*length*length;
        System.out.println("AREA OF THE EQUILATERAL TRIANGLE IS"+tArea);
    }
}
class Rectangle extends Shape{
    @Override
    public void input() {
        System.out.println("ENTER THE LENGTH OF RECTANGLE");
        length=scan.nextDouble();
        System.out.println("ENTER WIDTH/RADIUS OF RECTANGLE");
        width= scan.nextDouble();
    }

    @Override
    public void compute_area() {
        double cArea=length*width;
        System.out.println("AREA OF THE Rectangle IS "+cArea);
    }
}

