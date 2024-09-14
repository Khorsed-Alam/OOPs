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
<p>Constructor is Special type of method which has no return type.<br/>
Class name and Constructor Name Same.
</p>

````java

````


