package TypeCast_Non_primitive;

public class Main {
    public static void main(String[] args) {
        Person ob= new Teacher();// upcasting
        ob.display();

  /*     Teacher T1=(Teacher) new Person();// down casting doesn't allow in java
       T1.display();
*/
    }
}
