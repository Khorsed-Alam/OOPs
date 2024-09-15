package Static_Method_Restriction;

public class Static_Method {
    static  int x=10;
    void display(){
        System.out.println("I am non static method");

    }
    static void Display (){
        System.out.println(" "+x);
        System.out.println("Hello world");
       // void display();
    }
}
