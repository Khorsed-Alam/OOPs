package Automatic_Type_Conversion;

public class Main {
    public static void main(String[] args) {
        Overload ob=new Overload();

        ob.add();

        ob.add(3,6);

        ob.add(5.6,6.4);

        ob.add(2,4,5);
    }
}
