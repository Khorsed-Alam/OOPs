package Constructor_Overloading;

public class Main {
    public static void main(String[] args) {
        Teacher ob= new Teacher("khorsed","male");
        ob.Display();

        Teacher ob1= new Teacher("Khorsed Alam","male",14);
        ob1.Display();

        Teacher ob2= new Teacher();
        ob2.Display();
    }
}
