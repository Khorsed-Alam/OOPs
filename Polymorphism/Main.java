package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Person P1= new Person();
        P1.Display();

       // Person P1= new Teacher();
        P1= new Teacher();
        P1.Display();

        P1= new Student();
        P1.Display();
    }
}
