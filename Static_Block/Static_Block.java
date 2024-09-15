package Static_Block;

public class Static_Block {
    static  int id;
    static  String name;

    static {
        id=112330472;
        name= "Khorsed Alam";
    }
    static void DisplayStatic(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
    }
}
