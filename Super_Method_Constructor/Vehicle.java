package Super_Method_Constructor;

public class Vehicle {
    String color;
    double weight ;

    Vehicle(String C , double w)
    {
        color=C;
        weight=w;
    }
    void Display(){
        System.out.println("Color: "+color);
        System.out.println("Wegiht: "+weight);
    }
}
