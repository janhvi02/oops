package code.finalkeyword;

import code.statickeyword.StaticKeyword;

/**final variable=> you can not reassign the value to final variable
 * final method=> you can not override method
 * final class => you can not inherit class
 *
 */
public final class FinalKeyword {
    final int i=98;

    public void display(){
        //i=97;
    }


    public static void main(String[] args) {
        FinalKeyword obj = new FinalKeyword();
        obj.display();
        System.out.println(obj.i);
        StaticKeyword.show();
    }
}
//class b extends FinalKeyword{

//}