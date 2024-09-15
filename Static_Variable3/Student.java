package Static_Variable3;

public class Student {
    static  int count=0;
    Student(){
        count++;
    }
    void TotalStudent(){
        System.out.println("Total Student: "+count);
    }
}
