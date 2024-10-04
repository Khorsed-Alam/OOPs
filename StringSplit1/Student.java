package StringSplit1;

public class Student  {
    String name;
    int id;
    float cgpa;
    public Student(String name, int id, float cgpa){
        this.name=name;
        this.id=id;
        this.cgpa=cgpa;

    }
    void display(){
        System.out.println("Name "+name);
        System.out.println("Id "+id);
        System.out.println("Cgpa : "+cgpa);
    }
}
