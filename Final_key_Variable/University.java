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
