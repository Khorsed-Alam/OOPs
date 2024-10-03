package StringEquality;

import java.util.Scanner;

public class StringEquality {
    public static void main(String[] args) {
        String s1="Abc";
        Scanner sc= new Scanner(System.in);

        for(int i=0;i<3;i++){
            String s2=sc.next();

            if(s1.equals(s2))
            {
                System.out.println("Equal");
            }
            else{
                System.out.println("Not Equal");
            }
        }

    }
}
