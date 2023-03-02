package code.strings;

public class StringDemo1 {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer("Pune");      //mutable
        stringBuffer.append("City");
        System.out.println(stringBuffer);

        StringBuilder stringBuilder=new StringBuilder("Pune");
        stringBuilder.append("City");
        System.out.println(stringBuilder);
        stringBuilder.reverse();

        String str="welcome";
        StringBuilder stringBuilder1=new StringBuilder(str);
        stringBuilder1.reverse();
        System.out.println(stringBuilder1);


    }
}
