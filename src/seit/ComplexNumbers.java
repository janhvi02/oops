package seit;

public class ComplexNumbers {
    int real,imag;
    ComplexNumbers(){
        System.out.println("DEFAULT");
    }
    ComplexNumbers(int a,int b){
        this.real=a;
        this.imag=b;
    }
    void display(){
        System.out.println(real+"+"+"i"+imag);
    }
    void add(ComplexNumbers c1){
        System.out.println(this.real+c1.real + "+i" +(c1.imag+imag));
    }
    void sub(ComplexNumbers c2){
        System.out.println(this.real- c2.real+"+i"+(c2.imag-imag));
    }
    void multiply(ComplexNumbers c3){
        System.out.println(this.real*c3.real+"+i"+(c3.imag*imag));
    }
    public static void main(String[] args) {
        ComplexNumbers c1 = new ComplexNumbers(88,90);
        c1.add(c1);
        ComplexNumbers c2=new ComplexNumbers(88,90);
        c2.sub(c2);
        ComplexNumbers c3=new ComplexNumbers(88,90);
        c3.multiply(c3);
    }
}
