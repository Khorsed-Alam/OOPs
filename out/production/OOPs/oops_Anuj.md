<h1>Encapsulation</h1>
<B>In This Lecture</B>
<ol>
<li>Java Packages</li>
<li>Access Modifier</li>
<li>Java Encapsulation </li>
<li>Data Hiding </li>
<Li>The Static Keyword </Li>
</ol>

<h3>Package</p>

<p> package is a simply a container that groups related types (Java Classes , Interfaces, Enumeration , and Annotations</p>
<p>"package" keyword then package name </p>
<p>To define a package in java use --> "package" keyword </p>

<p>we can create package into another package (firstpackage).(secondpackage)</p>

<h4>Import a Package</h4>
<p>use "import" keyword to import package </p>
<p>For import all package use --> {import java.io.*;}</p>
<p>Import only one class use --> {import java.util.(class_name);} Example : User input [using Scanner class] </p>
<p> import statement is written directly after package statement and before the class definition </p>

````java
class Animal {
    private void display() {// private method

    }

    public void Display() {// public method

    }
}
````

<h4>Access Modifer </h4>
<p>Access MOdifer are use to set accessibility (visibility) of Class , Interface , Variable , Method, Constructor, Data member and the setter methods</p>
<b>Type of Access Modifer</b>
<ol>
<li>Default ---> Only one Pack is possible </li>
<li>Private ---> only one class</li>
<li>Protected--->immediate child can Access---> condition(all package but immediate child) </li>
<li>Public  ---> All Package are possible </li>
</ol>


<h2>Java Encapsulation</h2>
<p>Encapsulation refer to the bundling of field and method inside a single class.<br/>
it prevents outer classes from accessing and changing fields and methods of a class.<br/>
This is also helps to achieve data hiding.
</p>
<h4>Data Hiding </h4>
<p>Data Hiding is hiding internal data from outside users</p>
<p>Encapsulation</p>
<p>Encapsulation in itself is not data hiding </p>

```java
package PackageLearn;

public class person {
     private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String id;


}
```

```java
package PackageLearn;
// package can be create into another package {package into package}

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

```

<h3> The Static Keyword</h3>
