package StringSubString;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1= sc.next();

        String s2= s1.substring(3,5);
        System.out.println(s2);
    }
}
