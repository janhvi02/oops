/**
 * deposit money
 * withdraw money
 * check the balance
 */

package seit;
import java.util.Scanner;

public class BankArray {
    int employee;
    String name;
    double salary;
    Scanner scan=new Scanner(System.in);
    void accept_data(){
        System.out.println("ENTER EMPID ");
        employee=scan.nextInt();
        System.out.println("ENTER NAME ");
        name = scan.next();
        System.out.println("ENTER THE SALARY ");
        salary = scan.nextDouble();
    }
public  void display(){
        System.out.println(employee +"\t" +name +"\t" +salary);
    }
}
class EmployeeDataBase extends BankArray{
    public static void main(String[] args) {
        EmployeeDataBase obj[] = new EmployeeDataBase[2];
        int i;
        System.out.println("ENTER EMPLOYEE DATA");
        for(i=0;i<2;i++){
            obj[i] = new EmployeeDataBase();
            obj[i].accept_data();
        }
        System.out.println("EMPLOYEE DATA IS AS FOLLOWS...");
        for(i=0;i<2;i++) {
            obj[i].display();
       }
    }
}
