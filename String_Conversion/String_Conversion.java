package String_Conversion;

import java.io.StringReader;
import java.util.Scanner;

public class String_Conversion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a= sc.nextInt();
        float f= 3.1416f;
        boolean b=sc.nextBoolean();
        long l= sc.nextLong();

        String s1=a+ " ";
        String s2=String.valueOf(f);
        String s3= String.valueOf(b);
        String s4= String.valueOf(l);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);


        int i1= Integer.parseInt(s1);
        float f1=Float.parseFloat(s2);
        boolean b1=Boolean.parseBoolean(s3);
        long l1= Long.parseLong(s4);

        System.out.println(i1);
        System.out.println(f1);
        System.out.println(b1);
        System.out.println(l1);




    }
}
