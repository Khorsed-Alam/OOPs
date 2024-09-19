package String_Comparison;

import com.sun.security.jgss.GSSUtil;

public class Equal_Operator {
    public static void main(String[] args) {
        String Password1="1234";
        String Password2="1234";
        String Password3= new String("1234");
        String Password4= new String("1234");

        System.out.println(Password1 == Password2);
        System.out.println(Password1 == Password3);
        System.out.println(Password3 == Password4);


    }
}
