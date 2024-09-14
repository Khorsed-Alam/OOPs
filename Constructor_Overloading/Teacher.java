package Constructor_Overloading;

import java.util.TreeMap;

public class Teacher {
    String name, gender;
    int phone;
    Teacher(){
        System.out.println("No information");
    }
    Teacher (String nm, String gen){
        name=nm;
        gender=gen;

    }
    Teacher (String nm , String gen, int ph){
        name=nm;
        gender = gen;
        phone= ph;
    }
    void Display(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Phone: "+phone);
        System.out.println();
    }
}
