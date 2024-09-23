package File_Read;

import java.io.File;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) {

     try{
         File file= new File("C:\\Users\\hp\\OneDrive\\Desktop\\Academic\\OOPs\\File_Read");
         Scanner scanner= new Scanner(file);
         while(scanner.hasNext()){
             String id =scanner.next();
             String name=scanner.next();
             System.out.println("ID: "+id+"Name: "+name);
         }
     }catch(Exception E){
         System.out.println(E);
     }
    }
}
