package ReadWritewithBuffer;

import java.io.*;

public class JRW {
    public static void main(String[] args) {
        try{
            FileReader fileReader= new FileReader("ReadWritewithBuffer/A.txt");
            BufferedReader reader=new BufferedReader(fileReader);

            FileWriter fileWriter=new FileWriter("ReadWritewithBuffer/B.txt");
            BufferedWriter writer= new BufferedWriter(fileWriter);

            String line ;
            while ((line=reader.readLine())!=null){
                writer.write(line);
                writer.newLine();
            }
            reader.close();
            writer.close();

        }catch (IOException E){
            E.printStackTrace();
        }
    }
}
