package Abstraction;

public class Main {
    public static void main(String[] args) {

        Mobile_user md;
        md= new Rahim() {
            void sendMassage() {
                super.sendMassage();
            }
        };
        md = new Karim() {
            @Override
            void sendMassage() {
                super.sendMassage();
            }
        };

    }
}
