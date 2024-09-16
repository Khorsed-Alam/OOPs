package Instanceof_Operator;

public class Main {
    public static void main(String[] args) {
        Animal A1 = new Animal();
        Person P1 = new Person();
        Teacher T1 = new Teacher();

        System.out.println(T1 instanceof Person);
        System.out.println(P1 instanceof Animal);
        System.out.println(A1 instanceof  Person);
    }
}
