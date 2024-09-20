package Create_File;

import java.io.File;

public class File_Create_Delete {
    public static void main(String[] args) {
        File dir= new File("Person");
        dir.mkdir();
        String Path= dir.getAbsolutePath();
        File file1= new File("C:\\Users\\hp\\OneDrive\\Desktop\\Academic\\OOPs\\Person\\Student.txt");
        File file2= new File("C:\\Users\\hp\\OneDrive\\Desktop\\Academic\\OOPs\\Person\\Teacher.txt");


        try {
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("File are Created");
        }catch (Exception e){
            System.out.println(e);
        }

        file2.delete();
         if(file2.exists()){
             System.out.println("Doesn't Exist");
         }

        if(file1.exists()){
            System.out.println("File Exists");
        }

    }
}
