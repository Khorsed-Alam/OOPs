package This_Keyword;

public class Person {
    String name;
    int age;
    String haircolor;
    Person (String name, int age){
        this.name=name;
        this.age= age;
    }
    Person(String name , int age, String haircolor){
        this(name,age);
        this.haircolor= haircolor;
    }
    void Display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(haircolor);
        System.out.println();
    }
}
