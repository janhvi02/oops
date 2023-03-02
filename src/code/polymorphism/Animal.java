package code.polymorphism;

public class Animal {
    public void sound() {

        System.out.println("ANIMAL SOUND");
    }
}

    class dog extends Animal {
        @Override
        public void sound() {

            System.out.println("DOG SOUND");
        }

        public static void main(String[] args) {
            dog obj = new dog();
            obj.sound();
        }
    }

    class cat extends Animal {
        @Override
        public void sound() {
            System.out.println("CAT SOUND");
        }

        public static void main(String[] args) {
            Animal obj = new cat();// dynamic dispatch method
            obj.sound();
        }
    }

/* method overriding -> if two classes have same method name and same parameter
runtime polymorphism , late binding, dynamic binding
advantage -> we can give implementation to method  which is already implemented  by another class
 // code calisthenics
 */

