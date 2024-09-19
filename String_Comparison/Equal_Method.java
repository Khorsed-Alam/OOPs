package String_Comparison;

import Anonymous_Class.Person;

public class Equal_Method {
    public static void main(String[] args) {
        String Password1= "1234";
        String Password2= "1234";
        String Password3= new String("1234");
        String Password4= new String("1234");

        System.out.println(Password1.equals(Password2));
        System.out.println(Password1.equals(Password3));
        System.out.println(Password3.equals(Password4));


    }
}
