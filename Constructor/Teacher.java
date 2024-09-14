package Constructor;

public class Teacher {
    String  name;
    String gender;
    int phone;
    Teacher(String N, String g, int ph ){
        name=N;
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
