package FileReadWithBuffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTest {
    public static void main(String[] args) {
        try{
            FileReader fileReader=new FileReader("FileReadWithBuffer/Text.txt");
            BufferedReader reader= new BufferedReader(fileReader);

            String line=reader.readLine();
            String[] parts= line.split(", ");
            String name=parts[0];
            int id= Integer.parseInt(parts[1]);
            float cgpa= Float.parseFloat(parts[2]);

            Student st= new Student(name,id,cgpa);
            reader.close();

        }catch (IOException e){
             e.printStackTrace();
        }
    }

}
