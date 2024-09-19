package Number_Format;

import java.text.DecimalFormat;

public class Decimal_Number_Format {
    public static void main(String[] args) {
        DecimalFormat ob= new DecimalFormat("0.00");
        double X= 3.1416;
        System.out.println("X= "+ob.format(X));
    }
}
