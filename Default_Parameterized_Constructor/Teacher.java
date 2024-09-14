package Default_Parameterized_Constructor;

public class Teacher {
    String Name;
    String Gender;
    int age;

    Teacher(){
        System.out.println("No value");
    }
    Teacher(String N, String G, int A){
        Name=N;
        Gender=G;
        age=A;
    }

    void Display(){
        System.out.println("Name: "+Name);
        System.out.println("Gender: "+Gender);
        System.out.println("Age : "+age);
        System.out.println();
    }
}
