/**
 * Design and develop a context for given case study and implement an interface for Vehicles
 * Consider the example of vehicles like bicycle, car and bike. All Vehicles have common
 * functionalities such as
 * Gear Change, Speed up and apply breaks. Make an interface and put all
 * these common functionalities. Bicycle, Bike, Car classes should
 */
package seit;
import java.util.*;
public class InterfaceDemo {

    static class Bike implements Interface1 {
        int gear,speed;
        Bike(){
            System.out.println("BIKE STARTED SUCCESSFULLY");
            gear=1;
            speed=10;
        }

        @Override
        public void gear_change(int a) {
            if(gear<7 && gear>0){
                this.gear=a;
                System.out.println("GEAR CHANGED SUCCESSFULLY"+gear);
            }else{
                System.out.println("GEAR OUT OF RANGE");
            }
        }

        @Override
        public void speed_up() {
            if((speed+20)<100){
                speed+=20;
                System.out.println("BIKE SPEED INCREASED "+speed+"km/hr");
            }
            else{
                System.out.println("SPEED IS ALREADY ABOVE 100km/hr");
            }

        }

        @Override
        public void apply_breaks() {
            Scanner sc=new Scanner(System.in);
            int x;
            System.out.println("1. DECREASE SPEED\n 2.STOP BIKE");
            x=sc.nextInt();
            if(x==1)
                if((speed-20)>0){
                    speed-=20;
                    System.out.println("CURRENT SPEED IS "+speed);
                }else{
                    speed=0;
                    gear=0;
                    System.out.println("BIKE STOPPED");
                }
            if(x==2){
                speed=0;
                gear=0;
                System.out.println("BIKE STOPPED");
            }

        }
        @Override
        public void display() {
            System.out.println("BIKE SPEED IS ->"+speed+" \n"+"GEAR IS ->"+gear);

        }
    }

    static class Bicycle implements Interface1 {
        int gear,speed;
        Bicycle(){
            System.out.println("BIKE STARTED SUCCESSFULLY");
            gear=1;
            speed=10;
        }


        @Override
        public void gear_change(int a) {
            if(gear<7&&gear>0){
                this.gear=a;
                System.out.println("GEAR CHANGED SUCCESSFULLY"+gear);
            }else{
                System.out.println("GEAR OUT OF RANGE");
            }

        }

        @Override
        public void speed_up() {
            if((speed+5)<50){
                speed+=5;
                System.out.println("SPEED ACCELERATED->"+speed+"km/hr");
            }else{
                System.out.println("SPEED IS ALREADY ABOVE 5O km/hr");
            }

        }

        @Override
        public void apply_breaks() {
            Scanner sc=new Scanner(System.in);
            int x;
            System.out.println("1. DECREASE SPEED\n 2.STOP BIKE");
            x=sc.nextInt();
            if(x==1)
                if((speed-5)>0){
                    speed-=5;
                    System.out.println("CURRENT SPEED IS "+speed);
                }else{
                    speed=0;
                    gear=0;
                    System.out.println("BIKE STOPPED");
                }
            if(x==2){
                speed=0;
                gear=0;
                System.out.println("BIKE STOPPED");
            }
        }

        @Override
        public void display() {
            System.out.println("BIKE SPEED IS ->"+speed+" \n"+"GEAR IS ->"+gear);
        }
    }

    static class Car implements Interface1 {
        int gear,speed;
        Car(){
            System.out.println("CAR STARTED SUCCESSFULLY");
            gear=1;
            speed=10;
        }
        @Override
        public void gear_change(int a) {
            if(gear<7&&gear>0){
                this.gear=a;
                System.out.println("GEAR CHANGED SUCCESSFULLY"+gear);
            }else{
                System.out.println("GEAR RANGE OUT OF BOUND");
            }
        }

        @Override
        public void speed_up() {
            if((speed+20)<150){
                speed+=20;
                System.out.println("SPEED ACCELERATED->"+speed+"km/hr");
            }else{
                System.out.println("SPEED IS ALREADY ABOVE 5O km/hr");
            }


        }

        @Override
        public void apply_breaks() {
            Scanner sc=new Scanner(System.in);
            int x;
            System.out.println("1.DECREASE SPEED\n 2.STOP BIKE");
            x=sc.nextInt();
            if(x==1)
                if((speed-5)>0){
                    speed-=5;
                    System.out.println("CURRENT SPEED IS "+speed);
                }else{
                    speed=0;
                    gear=0;
                    System.out.println("BIKE STOPPED");
                }
            if(x==2){
                speed=0;
                gear=0;
                System.out.println("BIKE STOPPED");
            }

        }

        @Override
        public void display() {
            System.out.println("BIKE SPEED IS ->"+speed+" \n"+"GEAR IS ->"+gear);

        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Interface1 i=null;
        int y;
        System.out.println("ENTER YOUR CHOICE");
        System.out.println("1.Bike\n2.Bicycle\n3.Car\n");
        y= sc.nextInt();
        switch (y){
            case 1:
                i=new Bike();
                System.out.println("ENTER YOUR BIKE SPEED");
                int speed=sc.nextInt();
                i.speed_up();
                System.out.println("WHAT GEAR YOU WANT?");
                int a=sc.nextInt();
                i.gear_change(a);
                i.apply_breaks();
                i.display();
                break;
            case 2:
                i=new Bicycle();
                System.out.println("ENTER YOUR BICYCLE SPEED");
                int sped= sc.nextInt();
                i.speed_up();
                System.out.println("WHAT GEAR YOU WANT?");
                int gear=sc.nextInt();
                i.gear_change(gear);
                i.apply_breaks();
                i.display();
                break;
            case 3:
                i=new Car();
                System.out.println("ENTER YOU CAR SPEED");
                int speed1= sc.nextInt();
                i.speed_up();
                System.out.println("WHAT GEAR YOU WANT?");
                int gear1=sc.nextInt();
                i.gear_change(gear1);
                i.apply_breaks();
                i.display();
                break;
            default:
                System.out.println("INVALID CHOICE");

        }
    }
}
