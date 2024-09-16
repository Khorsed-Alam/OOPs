package Super_Method_Constructor;

public class Car extends Vehicle {
    int gear;
    Car(String c ,double w, int g){
        super(c,w);
        gear = g;
    }
    void Display(){
        super.Display();
        System.out.println("Gear: "+gear );
    }


}
