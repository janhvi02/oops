package seit;
import java.util.*;
public class GenericAssi {
    /////////////////////ARRAY METHOD///////////////////////
    public static <E> void arr(){
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY::");
        int n=s.nextInt();//taking size of array from user
        Object[] arr=new Object[n];
        System.out.println("ENTER ARRAY ELEMENT");
        for(int i=0;i<n;i++){
            arr[i]=s.next();
        }
        System.out.println("ENTERED ELEMENT ARE::");
        for(Object element : arr){
            System.out.println(element);
        }
        System.out.println();
    }
    public static <T> void palindrome(T s){
        String s1=(String)s;
        //converts s into string datatype
        s1=s1.toLowerCase();
        StringBuffer sb=new StringBuffer(s1);
        String ss=new String(sb.reverse());
        if(Objects.equals(s1,ss))
            System.out.println(s+"IS PALINDROME");
        else
            System.out.println(s+"IS NOT PALINDROME");
    }
    public static <T> void even_odd(T a){
        if((int)a%2==0)
            System.out.println(a+"EVEN NUMBER");
        else
            System.out.println(a+"ODD NUMBER");
    }
   public static <T> void checkfun(T s){
        try{
            int b=Integer.parseInt((String) s);
            System.out.println("WE CAN PERFORM ALL THE OPERATIONS");
        }catch (NumberFormatException e){
            System.out.println("WE CAN PERFORM ONLY PALINDROME");
        }
   }
   public class Main{
       public static void main(String[] args) {
           String s;
           Scanner sc=new Scanner(System.in);

       }
   }
}
