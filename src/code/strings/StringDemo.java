package code.strings;

public class StringDemo {
    public static void main(String[] args) {

        String str=new String("Pune");//2
        String str1="Pune";//0
        String str2="Pune";//0
        String str3=new String("Pune");//1
        String str4=new String("Pune");//1

        System.out.println(str==str1);//false  //checks reference
        System.out.println(str.equals(str1)); //true  // checks content
        System.out.println(str.equalsIgnoreCase(str1));//ignores case
        System.out.println(str.concat("City"));
    }
}
