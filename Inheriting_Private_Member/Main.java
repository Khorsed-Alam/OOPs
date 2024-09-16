package Inheriting_Private_Member;

public class Main {
    public static void main(String[] args) {
       Teacher T1 = new Teacher();
       T1.setName("Khorsed");
       T1.setAge(20);
       T1.setQualification("PHD");

        System.out.println(T1.getName());
        System.out.println(T1.getAge());
        System.out.println(T1.getQualification());


    }
}
