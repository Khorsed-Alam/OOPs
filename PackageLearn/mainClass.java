package PackageLearn;
// package can be create into another package {package into package}

import Constructor_Overloading.Teacher;

import java.util.Scanner; // import only Scanner CLass

//import java.io.*; import everything inside java.io package

public class mainClass {
    public static void main(String[] args) {
        person p1= new person();
        p1.setName("Khorsed Alam");
        System.out.println(p1.getName());

        p1.setId("0112330472");
        System.out.println(p1.getId());

    }
}





