package StringCompare;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1=sc.next();

        int n= sc.nextInt();

        for(int i=0;i<n;i++){
            String s2=sc.next();

            int res= s2.compareTo(s1);
            if(res>0){
                System.out.println(res);
                System.out.println(s2+" is Bigger than "+s1);
            }
            else if(res<0){
                System.out.println(res);
                System.out.println(s2+ " is Smaller Than "+s1);
            }
            else{
                System.out.println(res);
                System.out.println(s2 +" and "+s1 +" Both are Equal ");
            }
        }
    }
}
