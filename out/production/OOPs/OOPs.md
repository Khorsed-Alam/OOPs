<h1>Object Oriented Programming</h1>

<h3>Object Oriented Key Concepts</h3>
<ul>
<li>Class</li>
<li>Inheritance</li>
<li>Abstraction</li>
<li>PolyMorphism</li>
<li>Access Modifier</li>
<li>Interface</li>
<li>Encapsulation</li>
</ul>

<h3>Class:</h3>
<p>class is a template definition of the methods and variables in a particular kind of object</p>
<p>A Class is a blue print or template from which individual object are created.</p>
 
 <h4>Class Syntax</h4>

````java
public class Test {
    // variabel
    // method
}

````

<h3>Object:</h3>
<p>a data field that has unique attributes and behavior</p>

<h4> Object Syntax: </h4>

```java
        Teacher ob ;// object declare
        ob =new Teacher();// object create
        ob.name = "khorsed";// value assign

```
<h4> Method_Inside_Class </h4>

````java
       package Method_Inside_Class;

public class Car {
    String  name;
    String Model;
    int Price;

    void Display()// Create method.
    {
        // Method Body
        System.out.println("Name :"+name);
        System.out.println("Model:"+Model);
        System.out.println("Price :"+Price);


    }
}

````
````java
package Method_Inside_Class;

public class main {
    public static void main(String[] args) {
        Car c= new Car();
        c.name="BMW";
        c.Model="BMW iX M60 ";
        c.Price=10000000;
        c.Display();

        System.out.println();

        Car C1= new Car();
        C1.name="Honda";
        C1.Model="Civic";
        C1.Price=2000000;
        C1.Display();

    }
}

````

<h4> Parametrised Method </h4>

```java
package Parametrised_Method;

public class Teacher {
    String name,gender;
    int phone;
    void SetInfo(String n,String g,int ph ){
        name=n;
        gender=g;
        phone=ph;

    }
    void Display(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Phone: "+phone);
        System.out.println();
    }

}

```

````java
package Parametrised_Method;

public class Main {
    public static void main(String[] args) {
        Teacher ob =new Teacher();
        ob.SetInfo("Khorsed Alam ","Male",857265);
        ob.Display();

        Teacher ob1 =new Teacher();
        ob1.SetInfo("Khorsed   ","Male",8255674);
        ob1.Display();
    }
}

````
<h3>Constructor</h3>
<p>Constructor is a special type of method that is use to initialize the object</p>
<p>Constructor name and class name are same</p>
<p>Constructor has no return type not even Void</p>
<p>it called Automatically</p>
<p>Default Constructor(Non Parameter) , Parameterized </p>

````java
package Constructor;

public class Teacher {
    String  name;
    String gender;
    int phone;
    Teacher(String N, String g, int ph ){
        name=N;
        gender=g;
        phone=ph;
    }
    void Display(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Phone: "+phone);
        System.out.println();
    }
}


````

```java
package Constructor;

public class Main {
    public static void main(String[] args) {
        Teacher ob= new Teacher("Khorsed","male",2442526);
        ob.Display();

        Teacher ob1= new Teacher("Khorsed Alam","Male",59276);
        ob1.Display();
    }
}

```
<h3>Types of Constructor</h3>
<ol>
<li>Default Constructor(No Para meter) </li>
<li>Parametrized Constructor(Para Meter) </li>
</ol>

```java
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

```

```java
package Default_Parameterized_Constructor;

public class Main {
    public static void main(String[] args) {
        Teacher ob= new Teacher("khorsed alam","male",34);
        ob.Display();

        Teacher ob1= new Teacher();
        ob1.Display();


    }
}

```

<h3> Constructor Overloading </h3>
<p>constructor overloading occurs when we have multiple constructors in the same class (with the same name)
but with different numbers and types of parameters.</p>

````java
package Constructor_Overloading;

import java.util.TreeMap;

public class Teacher {
    String name, gender;
    int phone;
    Teacher(){
        System.out.println("No information");
    }
    Teacher (String nm, String gen){
        name=nm;
        gender=gen;

    }
    Teacher (String nm , String gen, int ph){
        name=nm;
        gender = gen;
        phone= ph;
    }
    void Display(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Phone: "+phone);
        System.out.println();
    }
}

````

````java
package Constructor_Overloading;

public class Main {
    public static void main(String[] args) {
        Teacher ob= new Teacher("khorsed","male");
        ob.Display();

        Teacher ob1= new Teacher("Khorsed Alam","male",14);
        ob1.Display();

        Teacher ob2= new Teacher();
        ob2.Display();
    }
}

````

<h3>Return Value from Method </h3>
<p>Use appropriate return type and return keyword</p>

```java
package Return_Value_From_Method;

public class ReturningValue {
    int Value;
    int square(int value){
        Value=value;
        return  Value *Value;

    }
}

```

```java
   package Return_Value_From_Method;

public class Main {
    public static void main(String[] args) {
        ReturningValue ob=new ReturningValue();
        int result = ob.square(5);
        System.out.println(result);

    }
}

```
<h3>Difference between Constructor and Method</h3>

| Constructor                                     | Method                                       |
|-------------------------------------------------|----------------------------------------------|
| initialize the state of an object               | Expose behaviour of object                   |
| No Return type                                  | Must have Return Type                        |
| Invoked implicitly (to call)                    | Invoke explicitly(to call)                   |
| Constructor name must be same as the class name | method Name should not be same as class name |


<h3> Static Keyword </h3>
<p>Static keyword in java in Java indicates that a particular member is not an instance, but rather part of a type</p>
<p>Memory management(Static Variable are keep one address into the memory)but instance are took memory for every object</p>
<p>Static varibale is not related to object ;it is related to class</p>


<h4>Uses Static key</h4>
<ol>
<li>Static Variable</li>
<li>Static Method</li>
<li>Static Block</li>
</ol>

````java
package Static_Keyword;

public class Student {
    String  name;
    String id;
    static  String university_name;
    Student(String n,String I){
        name=n;
        id=I;
    }
    void Display(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("University_Name: "+university_name);
        System.out.println();
    }
}

````

````java
package Static_Keyword;

public class Main {
    public static void main(String[] args) {
        Student ob= new Student("Khorsed","0112330472");
        ob.Display();
        Student ob2= new Student("Khorsed Alam","011452330472");
        ob2.Display();


    }

}

````

<h3>Static Variable Access </h3>
<p> To access any type of Static (variable ,method or block) don`t need any object Beacause Static keyword is related with class </p>

<p>To Access Static function {Class.(static variable, method,block)}</p>

```java
package Static_Variable;

public class Static_Variable {
    static  String name="khorsed alam";

}

```

````java 
package Static_Variable;

public class main {
    public static void main(String[] args) {
        System.out.println(Static_Variable.name);
        
    }
}

````

<h3> Static Variable </h3>
<p>Count Object number By Static keyword</p>

```java
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

```
```java
package Static_Variable3;

public class Main {
    public static void main(String[] args) {
        Student ob= new Student();
        ob.TotalStudent();
        Student ob1=new Student();
        ob1.TotalStudent();

        Student ob2= new Student();
        ob2.TotalStudent();
    }
}

```

<h3>Static Method 112 </h3>
<p>To call Static static method we dont need any type of object</p>

<strong> Access Static Method: {Class.(static method)} </strong>

````java
package Static_Method;

public class staticMethod {

    void Display(){
        System.out.println("I am non static Method");
    }
    static void Display1(){
        System.out.println("I am Static Method");
    }
    static void Display2(){
        System.out.println("3");
        System.out.println();
    }
}

````

````java
package Static_Method;

public class Main {
    public static void main(String[] args) {
      staticMethod.Display1();
      staticMethod.Display2();
    }
}

````

<h3> Static Method Restriction </h3>

<ul>
<li>Static Method can not use non static member</li>
<li>"this" and "super" keyword can not be used here.</li>
</ul>