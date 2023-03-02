package seit;
import java.util.Scanner;

public class Student {
    int Rollno;
    String Name;
    double[] Marks = new double[3];



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Student[] obj = new Student[5];
        obj[0] = new Student();
        obj[1] = new Student();
        for (int i = 0; i < 2; i++) {
            System.out.println("ENTER THE ROLLNO :");
            obj[i].Rollno = scan.nextInt();

            System.out.println("ENTER THE MARKS SCORED:");
            for(int j=0 ;j<3 ;j++)
                obj[i].Marks[j] = scan.nextDouble();
            System.out.println("ENTER NAME :");
            obj[i].Name = scan.next();
        }
        scan.close();;
        for(int i=0;i<2 ;i++){
            System.out.println("ROLLNO:"+obj[i].Rollno);
            for(int j=0 ;j<3;j++)
                System.out.println("MARKS:"+obj[i].Marks[j]);
            System.out.println("NAME:"+obj[i].Name);
        }
    }
}





