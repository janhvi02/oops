package seit;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class Employee {
    String employeid;
    long mobno;
    String empname,address,email;
    static double basicsalary, HRA, DA, GrossSalary, incometax, netsalary,pf;

    public void read() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the employee id");//taking all the inputs from the user
        employeid = scan.next();
        System.out.println("Enter the employee name");
        empname = scan.next();
        System.out.println("Enter the employee's address");
         address= scan.next();
        System.out.println("Enter the  employee's Email address");
        email= scan.next();
        System.out.println("Enter the employee's Mobile Number");
        mobno= scan.nextLong();
        System.out.println("Enter the basic salary of an employee");
        basicsalary = scan.nextInt();
        calculate();
    }
    public static void calculate()  //calculating all the parameters
    {
        HRA = 0.1 * basicsalary;
        DA = 0.73 * basicsalary;
        GrossSalary = basicsalary + DA + HRA+0.1*basicsalary;
        incometax = 0.3 * GrossSalary;
        netsalary = GrossSalary - incometax;
        pf=basicsalary*0.12;
    }
    public void display()  //displaying the calculating parameters
    {
        System.out.println("Employee id  :  " + employeid + "\n" +
                "Employee address"+address+
                "Employee name  :  " + empname + "\n" +
                "Employee basic salary :  " + basicsalary + "\n" +
                "HRA  :  " + HRA + "\n" +
                "DA  :  " + DA + "\n" +
                "GS  :  " + GrossSalary + "\n" +
                "Income tax  :  " + incometax + "\n" +
                "net salary  :  " + netsalary+ "\n" +
                "PF :"+pf);
    }
}
class Programmer2 extends Employee {
    Programmer2() {
    }
}
class TeamLeader extends Employee {
    TeamLeader() {
    }
}
class AssistantProjectManager extends Employee {
    AssistantProjectManager() {
    }
}
class ProjectManager extends Employee{
    ProjectManager(){
    }
}
class Assignment3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Programmer2 programmer2 = new Programmer2();
        TeamLeader teamLeader = new TeamLeader();
        AssistantProjectManager assistantProjectManager = new AssistantProjectManager();
        ProjectManager projectManager = new ProjectManager();
        System.out.println(" 1. Programmer\n " + "2. Team Leader\n " + "3. Assistant manager\n" + " 4. Project manager\n");
        int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("DETAILS OF PROGRAMMER ARE:->");
                    programmer2.read();
                    programmer2.calculate();
                    programmer2.display();
                    break;
                case 2:
                    System.out.println("DETAILS OF TEAM LEADER ARE:->");
                    teamLeader.read();
                    teamLeader.calculate();
                    teamLeader.display();
                    break;
                case 3:
                    System.out.println("DETAILS OF ASSISTANT MANAGER ARE:->");
                    assistantProjectManager.read();
                    assistantProjectManager.calculate();
                    assistantProjectManager.display();
                    break;
                case 4:
                    System.out.println("DETAILS OF PROJECT MANAGER ARE:->");
                    projectManager.read();
                    projectManager.calculate();
                    projectManager.display();
                    break;
                default:
                    System.out.println("INVALID OPTION");
            }
    }
}





