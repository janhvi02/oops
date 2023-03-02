package code.inheritance;

public class Inheritance {
    int id;
    String name;
    String address;
}

class Inheritance2 extends Inheritance{
    public static void main(String[] args) {


        Inheritance2 obj = new Inheritance2();
        obj.id = 1;
        obj.name = "Rohit";
        obj.address = "Aurangabad";
        System.out.println(" ID-> " + obj.id + " NAME-> " + obj.name + " ADDRESS-> " + obj.address);
    }
}

class Inheritance3 extends Inheritance2 {
    public static void main(String[] args) {

        Inheritance3 obj = new Inheritance3();
        obj.id=2;
        obj.name="Rutika";
        obj.address="Kolhapur";
        System.out.println(" ID-> " + obj.id + " NAME-> " + obj.name + " ADDRESS-> " + obj.address);

    }
}
/** private - within  class
 * default - only package
 * protected - only in package and through inheritance outside the package
 * public - whole project
 */
