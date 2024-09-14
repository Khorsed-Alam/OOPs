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
