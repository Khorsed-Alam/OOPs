package Write_Into_File_By_User;

import java.util.Formatter;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) {
        String id;
        String name;

        try{
            Formatter formatter = new Formatter("C:\\Users\\hp\\OneDrive\\Desktop\\Academic\\OOPs\\Write_Into_File_By_User\\ Student");
            Scanner Input= new Scanner(System.in);
            System.out.print("How many Student:");
            int num= Input.nextInt();

            for (int i = 1; i <= num; i++) {
                System.out.print("Enter Student id and name: ");
                id= Input.next();
                name= Input.next();

                formatter.format("%s %s \r \n ",id , name);

            }
            formatter.close();
        }catch (Exception E){
            System.out.println(E);
        }
    }
}
