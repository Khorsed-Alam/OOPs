package Parametrised_Method;

public class Teacher {
    String name,gender;
    int phone;
    void SetInfo(String n,String g,int ph ){
        name=n;
        gender=g;
        phone=ph;

    }
    void Display(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Phone: "+phone);
        System.out.println();
    }

}
