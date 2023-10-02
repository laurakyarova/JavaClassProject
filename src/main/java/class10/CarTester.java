package class10;

public class CarTester {
    public static void main(String[] args) {

        Car tesla = new Car();
            tesla.make = "Tesla";
            tesla.color = "Black";
            tesla.price = 38000;
        tesla.autopilot();
        tesla.parking();
        tesla.drive();
        System.out.println(tesla.make);
        System.out.println(tesla.color);
        System.out.println(tesla.price);

        Car ferarri = new Car();
        ferarri.make = "Ferarri";
        ferarri.color = "White";
        ferarri.price = 120000;
        ferarri.autopilot();
        ferarri.parking();
        ferarri.drive();
        System.out.println(ferarri.make);
        System.out.println(ferarri.color);
        System.out.println(ferarri.price);


        Car jeep = new Car();
        jeep.make = "Cherokee";
        jeep.color = "Silver";
        jeep.price = 45000;
        System.out.println(jeep.make);
        System.out.println(jeep.color);
        System.out.println(jeep.price);
        jeep.autopilot();
        jeep.parking();
        jeep.drive();






    }
}
