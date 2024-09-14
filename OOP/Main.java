package OOP;

public class Main {
    public static void main(String[] args) {
        Teacher ob ;// object declare
        ob = new Teacher();// object create

        ob.name="Liton";
        ob.gender="male";
        ob.phone=24563;

        System.out.println("Name: "+ob.name);
        System.out.println("Gender: "+ob.gender);
        System.out.println("phone: "+ob.phone);
        System.out.println();

        Teacher ob1=new Teacher();// Object declare and Create.
        ob1.name ="Shakib";
        ob1.gender="Male";
        ob1.phone=567226;
        System.out.println("Name: "+ob1.name);
        System.out.println("Gender: "+ob1.gender);
        System.out.println("phone: "+ob1.phone);

    }
}
