package Create_File;

import java.io.File;

public class Directory_Create_Delete {
    public static void main(String[] args) {
        File dir= new File("C:\\Users\\hp\\OneDrive\\Desktop\\Academic\\OOPs\\Person" );// Create Directory/Folder On specific location
        dir.mkdir();// Directory will Be Created
        String DirectoryLocatiionPath= dir.getAbsolutePath();// ToFind Path of Created Directory
        System.out.println(DirectoryLocatiionPath);// Print Directory Path
        System.out.println(dir.getName());// Print Directory Name
        if (dir.delete()){// if you want to delete directory use .delete()Method
            System.out.println(dir.getName() + " Folder has Been delete ");
        }

        // Again Directory Created
        File dir1= new File("C:\\Users\\hp\\OneDrive\\Desktop\\Academic\\OOPs\\Person" );// Create Directory/Folder On specific location
        dir1.mkdir();// Directory will Be Created

    }
}
