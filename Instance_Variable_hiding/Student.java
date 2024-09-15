package Instance_Variable_hiding;

import java.util.SplittableRandom;

public class Student {
    String name;
    String gender;
    int age;
    Student(String name, String gender,int age){
        this.name=name;
        this.gender=gender;
        this.age=age;
    }
    void Display(){
        System.out.println(name);
        System.out.println(gender);
        System.out.println(age);
    }
}
