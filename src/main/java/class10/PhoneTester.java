package class10;

public class PhoneTester {
    public static void main(String[] args) {

        Phone iPhone=new Phone();

        iPhone.brand="Apple";
        iPhone.color="Black";
        iPhone.price=750;

        Phone pixel=new Phone();

        pixel.brand="Google";
        pixel.color="White";
        pixel.price=1200;

        Phone samsung=new Phone();

        samsung.brand="Samsung";
        samsung.color="Orange";
        samsung.price=847;



        System.out.println(iPhone.brand);
        System.out.println(iPhone.color);
        System.out.println(iPhone.price);


        iPhone.alarm();

        iPhone.text();

        iPhone.camera();

    }


    
}
