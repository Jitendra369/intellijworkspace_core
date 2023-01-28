package designpattern.startegy;

public class Test_main {
    public static void main(String[] args) {
        Vehical vehical = new Vehical(new SportDriveStrategy());
        vehical.drive();
    }
}
