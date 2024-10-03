package StringContain;

import java.util.Scanner;

public class StringContain {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1=sc.next();
        String s2= sc.next();

        int index=s2.indexOf(s1);
        System.out.println(index);

        boolean b= s2.contains(s1);
        System.out.println(b);

        char []c= s2.toCharArray();
        for(int i=0;i<s2.length();i++){
            char c1=s2.charAt(i);
            System.out.println(c1);

        }
    }
}
