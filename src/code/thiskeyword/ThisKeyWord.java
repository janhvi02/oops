package code.thiskeyword;

public class ThisKeyWord {
    /**This keyword -> 1.this refers the current instance variable
     *2. this keyword is used to invoke current class method
     * 3. this keyword is used to invoke constructor
     */
    int id;
    String name;
    String address;

    public ThisKeyWord(int id , String name , String address){
        this.id = id;
        this.name = name;
        this.address = address;

    }
    public void display(){
        System.out.println("IN DISPLAY");
    }
    public ThisKeyWord() {
        this(5, "tom", "nagpur");
    }
           public void show () {
            this.display();
    }

    public static void main(String[] args) {
        ThisKeyWord obj = new ThisKeyWord();
        System.out.println(" id->" + obj.id + "\n name->" +obj.name + "\n address->" + obj.address);

        obj.show();


    }
}
