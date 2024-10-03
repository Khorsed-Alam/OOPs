package StringSplit;

import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1=sc.next();

        String[] parts= s1.split(",");
        for(int i=0;i<parts.length;i++){
            System.out.println(parts[i]);
        }
    }
}
