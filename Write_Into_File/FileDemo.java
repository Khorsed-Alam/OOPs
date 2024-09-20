package Write_Into_File;

import java.util.Formatter;

public class FileDemo {
    public static void main(String[] args) {
        try {
            Formatter formatter= new Formatter("C:\\Users\\hp\\OneDrive\\Desktop\\Academic\\OOPs\\Write_Into_File\\ Person");
            formatter.format("%s %s \r\n","0112330472","Khorsed Alam");
            formatter.format("%s %s \r\n","0112330474","Khorsed ");
            formatter.format("%s %s \r\n","0112330475","Alam");
            formatter.close();


        }catch (Exception E){
            System.out.println(E);
        }
    }
}
