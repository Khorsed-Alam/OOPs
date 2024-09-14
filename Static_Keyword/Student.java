package Static_Keyword;

public class Student {
    String  name;
    String id;
    static  String university_name;
    Student(String n,String I){
        name=n;
        id=I;
    }
    void Display(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("University_Name: "+university_name);
        System.out.println();
    }
}
