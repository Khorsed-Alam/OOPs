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

```java
package Static_Method_Restriction;

public class Static_Method {
    static  int x=10;
    void display(){
        System.out.println("I am non static method");

    }
    static void Display (){
        System.out.println(" "+x);
        System.out.println("Hello world");
       // void display();
    }
}

```

````java
package Static_Method_Restriction;

public class Main {
    public static void main(String[] args) {
         Static_Method.Display();
//         Static_Method.dispaly();
// Error because Static Method can not use non static

    }

}

````

<h3> Static Block </h3>
<P>All Element are static into the Block</P>

```java
package Static_Block;

public class Static_Block {
    static  int id;
    static  String name;

    static {
        id=112330472;
        name= "Khorsed Alam";
    }
    static void DisplayStatic(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
    }
}

```
```java
package Static_Block;

import Static_Method_Restriction.Static_Method;

public class Main {
    public static void main(String[] args) {
      Static_Block.DisplayStatic();
    }
}

```

<strong> If static block and main method stand into the same class then static block execute first </strong>

```java
package Static_Block;

public class staticBlock_Main {

    public static void main(String[] args) {
        System.out.println("Main Method");
    }

    static {
        System.out.println("Static Block");
    }


}

```


<h3>Variable Type</h3>

<p>There are three type of variable in java</p>
<ol>
<li>Local : Local variable is Declared inside method constructor or in a block</li>
<li>Instance : A varable that is declare inside the class but outside any method ---> Not a Static</li>
<li>Class / Static: A variable that start with static keyword. --> Its Can not declared as local variable</li>
</ol>

<h3> Instance Variable hiding </h3>
<p>Instance variable hide using "this" keyword </p>

```java
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

```
```java
package Instance_Variable_hiding;

public class Main {
    public static void main(String[] args) {
        Student ob=new Student("khorsed","male",29);
        ob.Display();
    }
}

```

<h3>Math Builtin Function </h3>
<b>Math Function</b>
<ol>
<li>{Math.abd(9.4)} -->Convert positive number</li>
<li>{Math.sqrt(25.0)} --> root form </li>
<li>{Math.pow(2,3)} -->2^3 </li>
<li>{Math.PI}--> Return pi value </li>
<li>{Math.e}--> Return E value </li>
<li>{Math.log(0.0)} --> Return log(0) value</li>
<li>{Math.exp(1.0)} --> Return exponentioal value value</li>
<li>{Math.max(2,3)} --> Return Max value</li>
<li>{Math.min(2,3)} --> Return Min value</li>
<li>{Math.ceil(5.6)} --> Upper Integer Number </li>
<li>{Math.floor(5.6)} --> lower Integer Number </li>



</ol>


<h3>Method Overloading</h3>
<p> multiple methods can have the same name but different parameters</p>
<p> Point to remember about Method Overloaring </p>
<ol>
<li>Same method name</li>
<li>Parameter list Different</li>
<li>Inside the same class</li>
</ol>

```java
package Method_Overloading;

public class methodOverload {
     void  add(int a,int b){
         System.out.println(a+b);
     }
     void add(double a, double b){
         System.out.println(a+b);
     }
     void add(int a, int b, int c){
         System.out.println(a+b+c);
     }
     void add(){
         System.out.println("No output");
     }

}

```
````java
package Method_Overloading;

public class Main {
    public static void main(String[] args) {
        methodOverload ob= new methodOverload();
        ob.add();
        ob.add(1,4);
        ob.add(2.4,3.5);
        ob.add(3,4,5);
    }
}

````

<h3> Automatic Type Conversion </h3>

|Type| Valid Promotions|
|---|----|
|Double|none|
|float| double|
|long|float or double|
|int |long , float or double|
|char |int , long ,float or double|
|short| int ,long,float or double|
|byte| short,int,long,float or double|
|boolean|boolean|

```java
package Automatic_Type_Conversion;

public class Overload {
    void add(double a, double b){
        System.out.println(a+b);
    }
    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    void add(){
        System.out.println("Nothing to add");
    }
}

```

```java
package Automatic_Type_Conversion;

public class Main {
    public static void main(String[] args) {
        Overload ob=new Overload();

        ob.add();

        ob.add(3,6);

        ob.add(5.6,6.4);

        ob.add(2,4,5);
    }
}

```


<h3>Access Modifier </h3>
<p>There are four type of access modifier</p>
<ol>
<li>Private---> private int age;</li>
<li>Protected---> protected int age </li>
<li>Public ---> public int age</li>
<li>Default --->default </li>
</ol>

<h1>Encapsulation</h1>

<p>Encapsulation is a process of-->{ Packaging Variable and method into a single unit}---->{Protecting data by declaring them as private } </p>

<p>Private data will be hidden from other classes and they can only be accessed through the methods of their current class this is known as data hiding</p>

<h4> How to do Encapsulation </h4>
<ol>
<li>Declare the variables as Private</li>
<li>Provide public setter and getter method to modify and get the variable values</li>
</ol>

<h4>Benefits of Encapsulation </h4>
<ul>
<li>provides data hiding</li>
<li>Reusability </li>
<li>Code can be modified without breaking the code</li>
<li>Maintainability : Hiding implementation details  reduces complexity </li>
</ul>

<h3>Setter and Getter </h4>
<p> to set data use setter method</p>
<p>To get data use Getter Method</p>

````java
package Encapsulation;

public class person {
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;


}

````
````java
package Encapsulation;

public class Main {
    public static void main(String[] args) {
        person p1 = new person();
        p1.setName("Khorsed Alam");
        p1.setAge(20);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
    }
}

````

<h1>Inheritance</h1>
<p><b>Definition:</b> Inheritance can be defined as the process where one class acquires(share) the properties of another</p>

<em> Syntax</em>

```java
class  Teacher extends Person{
    // Teacher --> Subclass / Child Class/ Derived Class
    // Person --> Parent Class/ Super Class/ Base Class
    
}
```

<b>Uses of Inheritance</b>
<ol>
<li>Reusability</li>
<li>Method Overriding </li>
</ol>

````java
package Inheritance;

public class Person {
    String Name;
    int age;

    void Display(){
        System.out.println("Name: "+Name);
        System.out.println("Age: "+age);
    }
}

````

```java
package Inheritance;

public class Teacher extends Person{
    // Name,age,Display()

String Qualification;

void Display2(){
    // Display(); Reuse
    System.out.println("Name :"+Name);
    System.out.println("Age: "+age);
    System.out.println("Qualificarion: "+Qualification);
}

}

```

````java
package Inheritance;

public class Main {
    public static void main(String[] args) {
        Teacher T1= new Teacher();
        T1.Name="Khorsed Alam";
        T1.age=20;
        T1.Qualification="phd";

        T1.Display2();

    }
}

````


<h3> Inheriting Private Member</h3> 
<p>Private member Cannot be inherit directly. We can use private properties using getter and setter </p>

```java
package Inheriting_Private_Member;

public class Person {
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private  int age;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

```

````java
package Inheriting_Private_Member;

public class Teacher extends Person {
    private String qualification;
    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    
}

````

````java
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

````


<h3>Instanceof Operator</h3>
<p>Instance = object </p>
<p> Instance of operator return boolean value </p>

````java
package Instanceof_Operator;

public class Animal {
}

````

```java
package Instanceof_Operator;

public class Person extends  Animal{
}

```

````java
package Instanceof_Operator;

public class Teacher extends  Person {

}

````
```java
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

```

<h3> Types of Inheritance </h3>
<ol>
<li>Single inheritance </li>
<li>Multilevel Inheritance </li>
<li>Hierarchical inheritance </li>
<li>Multiple Inheritance </li>
</ol>

<h4> Single Inheritance </h4>
<p>One subclass inherits from one superclass</p>

```java
public class a{
    
}
public class b extends a{
    
}
```

<h4>Multilevel Inheritance </h4>
<p>The Super Class for one is the subclass for other </p>

````java
public class a{

}
public class b extends a{

}
public class c extends b{
    
}
````
<h4> Hierarchical Inheritance </h4>
<p> Multiple subclass derived from single superclass </p>

````java
public class a{

}
public class b extends a{

}
public class c extends a{
    
}
````

<h4>Multiple Inheritance</h4>
<p>java cann`t support this inheritance</p>

```java
public class a{

}
public class b extends a{

}
public class c extends a{

}
public class d extends  b,c{
    
}
```


<h2>Method Overriding</h2>
<p>Declaring a method in subclass which is already present in superclass is known as Method Overriding </p>
<p>Name , Parameter , and return type same as superclass </p>

<h5>Use of Method Overriding </h5>
<ol>
<li>Code reuse</li>
<li> One Interface , Multiple Implement </li>
<li>Run time Polymorphism </li>
</ol>

<h5> Method Override rule</h5>
<ul>
<li>Name , Signature type , parameter must be same</li>
<li>If method cann't be Inherited then it cann't be overridden</li>
<li>final and static Keyword cann't be overridden</li>
<li>Constructor can not be overridden </li>
</ul>


```java
package Method_Overriding;

public class Person {
    String name;
    int age;

    void Display(){
        System.out.println(name);
        System.out.println(age);
    }
}

```

```java
package Method_Overriding;

public class Teacher extends Person {
    String qualification;

    void Display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(qualification);
    }

}

```

```java
package Method_Overriding;
public class Main {
    public static void main(String[] args) {
       Teacher T1 = new Teacher();
       T1.name="Khorsed Alam";
       T1. age=20;
       T1.qualification="Phd";

       T1.Display();
    }
}

```


<h2> Method Overloading vs Method Overriding</h2>

|Overload| Override                           |
|----|------------------------------------|
| Single Class| Multiple Class(super and sub)Class |
|Parameter must different| Parameter must be same|
|no inheritance concept|Must use Inheritance|
|Return type doesn't metter| Must be same return type|
|don't hide any method| Child method hide parent method|



<h3>Super keyword</h3>
<p>Super keyword is used to refer immediate super clss object</p>

<h4> Uses of Super Keyword </h4>

<ol>
<li>It is use to call super class instance variable</li>
<li>It is use to call super class overridden Method</li>
<li>It is use to call super class constructor</li>
</ol>

<strong>Super Class instance Variable<Strong>
```java
package Super_instance_variable;

public class A {
    int x=10;

}

```
```java
package Super_instance_variable;

public class B extends A{
     int x=5;
     void Display(){
         System.out.println(super.x);
     }
}

```

```java
package Super_instance_variable;

public class Main {
    public static void main(String[] args) {
        B a1= new B();
        a1.Display();
    }
}

```

<b> Super_Overridden_Method</b>

````java
package Super_Overridden_Method;

public class A {
    void Display(){
        System.out.println("Inside A Class");
    }
}

````
```java
package Super_Overridden_Method;

public class B extends A{
    void Display(){
        super.Display();
        //System.out.println("Inside B Class");
    }
}

```

```java
package Super_Overridden_Method;

public class Main {
    public static void main(String[] args) {
        B ob=new B();
        ob.Display();
    }

}

```

<h3>Super Keyword Constructor</h3>
<p> First print super class constructor then child class constructor </p>
<p> if super class put later into the code then code will error </p>

```java
package Super_Keyword_Constructor;

public class A {
    A() {
        System.out.println("A's Constructor");
    }
}

```

```java
package Super_Keyword_Constructor;

public class B extends A {
    B() {
        super();
        System.out.println("B's Constructor");
    }
}

```

```java
package Super_Keyword_Constructor;

public class Main {
    public static void main(String[] args) {
        B ob = new B();
    }
}

```

<h4>Super Keyword (Overridden method and Constructor)</h4>

```java
package Super_Method_Constructor;

public class Vehicle {
    String color;
    double weight ;

    Vehicle(String C , double w)
    {
        color=C;
        weight=w;
    }
    void Display(){
        System.out.println("Color: "+color);
        System.out.println("Wegiht: "+weight);
    }
}

```

```java
package Super_Method_Constructor;

public class Car extends Vehicle {
    int gear;
    Car(String c ,double w, int g){
        super(c,w);
        gear = g;
    }
    void Display(){
        super.Display();
        System.out.println("Gear: "+gear );
    }


}

```

```java
package Super_Method_Constructor;

public class Main {
    public static void main(String[] args) {
        Car volbo = new Car("White",300.0,5);
        volbo.Display();
    }
}

```


<h2>This Keyword</h2>
<p> "this" keyword used to refer current class object</p>
<ol>
<li>Refer current class instance variable</li>
<li>It can be use to call current class Constructor</li>
<li>It can be used to call current class Method</li>
<li>It can Passed as an argument in the Method(event Handling)</li>
</ol>

```java
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


```

```java
 package This_Keyword;

public class Main {
    public static void main(String[] args) {
        Person p1= new Person("Khorsed",20);
        p1.Display();

        Person p2= new Person("Khorsed",39,"black");
        p2.Display();
    }
}

```

<h5>This use in method</h5>

```java
package This_Method;

public class Person {
    void massage(){
        System.out.println("This is message method");

    }
    void Display(){
        this.massage();
        System.out.println("This is Message Method");
    }
}

```

````java
package This_Method;

public class Main {
    public static void main(String[] args) {
        Person p1= new Person();
        p1.Display();
    }
}

````


<h2> Final Keyword </h2>
<p> Using final keyword will restrict the user</p>
<ol>
<li>Final Variable</li>
<li>final Method</li>
<li>final class </li>
</ol>

<h4> Final variable</h4>
<ul>
<li>final variable</li>
<li>blank final variable---> Value set by Constructor</li>
<li>static blank final variable----> Value set by Static block </li>
</ul>

```java
package Final_key_Variable;

import Super_Method_Constructor.Car;

public class University {
    final String UNIVERSITY_NAME = "UIU";//Final variable
    final int fees;// Blank final varable

    University()
    {
        // To initialize blank final variable use constructor 
        fees= 60000;
    }

    static final int Credit;// static final variable  
    static {
        // To initialize static final keyword use static block
        Credit=138;
    }
    void Dispaly(){
        System.out.println(UNIVERSITY_NAME);
        System.out.println(fees);
        System.out.println(Credit);
    }
}

```
```java
package Final_key_Variable;

public class Main {
    public static void main(String[] args) {
        University ob= new University();
        ob.Dispaly();
    }
}

```

<h3>Final Method</h3>
<p>Final Method can not be overridden but if we want we can inherit this </p>

````java
package Final_Key_Method;

public class University {
    final void Display() {
        System.out.println("University Info");
    }
}

````

```java
package Final_Key_Method;

public class Student extends University {
    void Display1() {
        super.Display();
        System.out.println("Student Info");
    }
}

```

```java
package Final_Key_Method;

public class Main {
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.Display();
        S1.Display1();
    }
}

```

<h3> Final Keyword for Class</h3>
<p>Final keyword can not extend </p>

```java
package Final_Key_Class;

final public class University {
    void Display(){
        System.out.println("University Info");
    }

}

```

`````java
package Final_Key_Class;

public class Student extends University {
    void Display(){
        super.Display();
        System.out.println("Student Info");

    }
}

`````

```java
package Final_Key_Class;

public class Main {
    public static void main(String[] args) {
        Student ob = new Student();
        ob.Display();

    }
}

```

<h2>Polymorphism</h2>
<p>Polymorphism means many form</p>
<p>Polymorphism is a mechanism where a parent class reference variable can take many form (it can refer object from different classes)</p>

<h5>Types of Polymorphism </h5>
<ol>
<li>compile time / Static Polymorphism</li>
  <ul>
<li>Method overloading </li>
<li>Constructor Overloading </li>
</ul>
<li>Run time / Dynamic Polymorphism</li>
  <ul>
<li>Method Overriding </li>
</ul>
</ol>


```java
package Polymorphism;

public class Person {
    void Display(){
        System.out.println("I am a Person");
    }
}

```
```java
package Polymorphism;

public class Teacher extends Person{
    void Display(){
        System.out.println("I am a Teacher");
    }
}

```
```java
package Polymorphism;

public class Student extends Person{
    void Display(){
        System.out.println("I am a Student");
    }
}

```
```java
package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Person P1= new Person();
        P1.Display();

       // Person P1= new Teacher();
        P1= new Teacher();
        P1.Display();

        P1= new Student();
        P1.Display();
    }
}

```

<h2>Abstraction</h2>
<p>Abstraction is the process of hiding the implementation details and showing only the functionality to the user. </p>
<p>Hide back end work from user</p>

<Strong> There are two ways to achieve abstraction in Java </Strong>
<ol>
<li>Abstract Class (0-100)% Programmer can change this percentage </li>
<li>Interface (Achieve 100% abstraction )</li>

</ol>

<b>Non abstract Method</b>

````java 
   
    void massage(){
                
                    
    }
````
<h3>Abstract Method</h3>
```java
abstract void massage();
```

<h4>Condition for Abstract Method</h4>
<ol>
<li>Abstract Method has no body</li>
<li>Method end with semicolon</li>
<li>Method must be part of abstract class</li>
<li>must be Overridden</li>
<li>Abstract method can never be final and Static </li>
</ol>

<h3>Abstract Class</h3>
<p>Condition on Abstract Class</p>
<p> We can not create an object of abstract class but we can use reference variable </p>
<p>If you extends an abstract class you have to use all it abstract method or you have to declare the class as Abstract itself </p>

<ol>
<li>Abstract class have abstract and non abstract method</li>
<li>Non abstract class can not have any abstract method </li>
</ol>

```java
package Abstraction;

abstract  public class Mobile_user {
    abstract void  sendMassage();
}

```

````java
package Abstraction;

 public class Rahim extends Mobile_user {

    void sendMassage() {
        System.out.println("hi i am Rahim");
    }
}

````

````java
package Abstraction;

 public class Karim extends Mobile_user{

    void sendMassage() {
        System.out.println("hi i am Karim");
    }
}

````
````java
package Abstraction;

public class Main {
    public static void main(String[] args) {

       Mobile_user mu;
       mu= new Rahim();
       mu.sendMassage();
       
        mu= new Karim();
        mu.sendMassage();

    }
}

````

<h1>Interface</h1>
<p>An Interface is a collection of abstract method</p>
<p>We can not create an object of interface</p>

<h5>Why do we need an Interface</h5>
<ol>
<li>Fully Abstraction</li>
<li>Multiple Inheritance </li>
</ol>

<H4>Declaring an Interface</H4>
<p>Interface keyword is used to declare an interface</p>

<b>Interface Class<b>
````java
interface Class_name{
     
}
````

<b>Interface Method<b>
<p> Only abstract method can be store into the Interface Method </p>
<B>NB:</B>
<p>Java Compiler adds public and abstract keyword before the interface method</p>

````java
interface Class_name{
     void method_name():// do not need abstract keyword because compiler will provide this.
}
````

<h2> Interface Variable</h2>
<p> We can store variable into the interface class but condition ---> variable must be constant</p>

<p>Java compiler add public , static and fianl keyword before the interface variable, so we can say that all variable are constant into the interface class </p>

```java
interface Class_name{
    int speed = 30; // compiler will fixed this as public static final int speed=30
     void method_name();
}
```

<b>Interface Inherit </b>
<ol>
<li> Class extends class </li>
<li>Interface extend Interface</li>
<li>Interface Implements Class</li>
</ol>


```java
package Interface;

public interface Animal {
    public abstract void eat();
     }

```

```java
package Interface;

public class   Dog implements Animal{
    public void eat()
    {
        System.out.println("Dog can eat Meat");
    }
}

```
````java
package Interface;

public class Cat implements Animal {
    public void eat(){
        System.out.println("Cat can eat milk");
    }
}

````

```java
package Interface;

public class Main {
    public static void main(String[] args) {
      Dog D1= new Dog();
      D1.eat();

      Cat C1= new Cat();
      C1.eat();
    }
}

```

<h2> Why Interface Support Multiple Inheritance </h2>
<p>Java does not support multiple inheritance with classes
But Java Interface support Multiple Inhertance </p>

````java
package Multiple_Inheritance_by_Interface;

public interface A {
    void Play();
}

````
```java
package Multiple_Inheritance_by_Interface;

public interface B {
    void Play();
}

```
````java
package Multiple_Inheritance_by_Interface;

public class C implements A,B{
    public void Play(){
        System.out.println("Hello I am from C");
    }


}

````
```java
package Multiple_Inheritance_by_Interface;

public class Main {
    public static void main(String[] args) {
          C ob= new C();
          ob.Play();
    }
}

```


<h4> How interface is similar to a class</h4>
<ol>
<li>Interface can have any number of method</li>
<li>It has same file extension as java class </li>
<li></li>
</ol>


<h4> How interface is Different from a class</h4>
<ol>
<li> You can not create an object of Interface </li>
<li> Interface doesn't contain Constructor </li>
<li>All method in Interface are abstract </li>
<li>An interface can not have instance variable</li>
<li>An Interface can extend multiple interface </li>
<li></li>
</ol>

<h3> Interface Vs Abstract class</h3>

|Interface|Abstract Class|
|---|----|
|Can only have abstract method | Can have abstract and non abstract method|
|support multiple inheritance | Doesn't support Multiple Inhetitance |
|Interface have Static and final variable| Can have static non static ,final and non final variable|
|Fully Abstract| Partial Abstract|



<h1>Package </h1>
<p>A package is a group of related classes interface and sub package </p>

<strong>Two type of Package <strong>
<ol>
<li>Built in Package (Scanner) </li>
<li>User define Package </li>
</ol>

<h3> Bulit IN Package </h3>

<ol>
<li> Java Package ---> Java Subpackage ---> Class</li>
<li>import java.util.Scanner </li>
<li>io----> Reader / Writer file </li>
<li>lang----> Math /String / String Buffer Systrm</li>
<li>net---> URL Socket </li>
<li>util-----> Scanner Arrays /ArrayList/ Random </li>
<li>awt ----> Button / Image / Label / Menu </li>
<li>applet-----> </li>
</ol>





<h1>Access Modifier </h1>
<b>Modifier</b>
<p>Access modifiers in Java are the keywords that are used for controlling the use of the methods, constructors, fields, and methods in a class</p>

<h4> Types of Modifier</h4>
<ol>
<li>Access Modifier</li>
<li>Non Access Modifier </li>
</ol>

<h4> Access Modifer</h4>
<ol>
<li>Private---> Access only same class</li>
<li>public----> Access any Class or any Package </li>
<li>protected----> access same package but condition --->class must be inherited or Child class </li>
<li>Default---> default member will accessable into same package </li>
</ol>

<h4> Non Access Modifier</h4>
<ol>
<li>static</li>
<li>abstract </li>
<li>volatile </li>
</ol>



<h1>Type Casting</h1>
<p>Converting one data type to another is called type casting</p>
<b>Type of Data</b>
<ul>
<li>primitive data</li>
<li>Non primitive data</li>
</ul>

<h5>Classification of type casting(primitive)</h5>
<ol>
<li>Implicit type casting</li>
<p>byte ---> short ---> int ---> long ---> float ---> double</p>
<li>Explicit type Casting </li>
<p>double ---> float ---> long ---> int ---> short ---> byte</p>
</ol>


<h5>Classification of type casting(Non primitive)</h5>
<ol>
<li>UpCasting( store subclass class object into the super class object </li>
<li>Down casting( store super class object into the subclass object </li>
<li>Java doesn't allow down casting </li>
</ol>


<h1>Anonymous Class</h1>
<p>A class who has no name</p>

````java
package Anonymous_Class;

public class Person {
    void Display(){
        System.out.println("Person Class");
    }
}

````
````java
package Anonymous_Class;

public class Main {
    public static void main(String[] args) {
        Person P1= new Person(){
            @Override
            void Display() {
                System.out.println("Test Class");
            }
        };
        P1.Display();
    }
}

````


<h1>Exception Handling </h1>
<p>What is Exception ----> An Exception is a runtime error</p>
<p>An Exception is an abnormal condition that arises in a code sequence at run time</p>

<p>OBJECT --> Throwable ---> Error + Exception </p>


<b>Different type of Exception</b>
<ol>
<li>Arithmetic Exception </li>
<li>Null Pointer Exception</li>
<li>StringIndexoutofBoundsException</li>
<li>Number Format Exception</li>
<li>File Not Found Exception</li>
<li>Array index out of Bounds Exception </li>
<li>Class Not found Exception </li>
<li>IO Exception</li>
<li>No SuchMethodException</li>
<li>
</ol>


<h3>What is Exception Handling</h3>
<p>The exception handling is one of the powerful mechanism to handle the runtime errors. </p>

<strong>Exception Handling is Managed by five Keyword</strong>
<ol>
<li>try</li>
<li>catch</li>
<li>finally</li>
<li>throw</li>
<li>throws</li>
</ol>

<h4>try - Catch- finally Block</h4>
```java

try{
     //Doubtful program as an exception
}catch(Exception type1 e1){
    // First Exception
}catch(Exception type2 e2){
    // Second Exception
}finally{
    // Block of code to be execute after try block
        }
```

<b>Java Pactice<b>