package seit;

public class BankDemo {
    int accNo;
    String Name;
    double acc_balance;

    public void displayInfo(){
        System.out.println("ACCOUNT NUMBER->"+accNo);
        System.out.println("NAME->"+Name);
        System.out.println("ACCOUNT BALANCE->"+acc_balance);
    }

    public static void main(String[] args) {
        BankDemo acc1=new BankDemo();
        acc1.accNo=124;
        acc1.Name="Rajesh";
        acc1.acc_balance=100000;
        System.out.println("****ACCOUNT DETAILS OF ACCOUNT NUMBER 1****");
        acc1.displayInfo();
        BankDemo acc2 = new BankDemo();
        acc2.accNo=424;
        acc2.Name="Revati";
        acc2.acc_balance=106300;
        System.out.println("****ACCOUNT DETAILS OF ACCOUNT NUMBER 2****");
        acc2.displayInfo();
    }

}
