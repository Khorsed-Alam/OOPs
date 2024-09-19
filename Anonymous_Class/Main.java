package Anonymous_Class;

public class Main {
    public static void main(String[] args) {
        Person P1= new Person(){
            @Override
            void Display() {
                System.out.println("Test Class");
            }
        };
        P1.Display();
    }
}
