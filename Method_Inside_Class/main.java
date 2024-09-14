package Method_Inside_Class;

public class main {
    public static void main(String[] args) {
        Car c= new Car();
        c.name="BMW";
        c.Model="BMW iX M60 ";
        c.Price=10000000;
        c.Display();

        System.out.println();

        Car C1= new Car();
        C1.name="Honda";
        C1.Model="Civic";
        C1.Price=2000000;
        C1.Display();

    }
}
