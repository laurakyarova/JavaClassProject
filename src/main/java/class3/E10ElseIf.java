package class3;

public class E10ElseIf {
    public static void main(String[] args) {

// use .equals for the String/non-primitive variables
        String fruit="Apple";

        if(fruit.equals("Mango")){
            System.out.println("Price is $5");
        }else if(fruit.equals("Orange")){
            System.out.println("Price is $4");
        }else if(fruit.equals("Apple")){
            System.out.println("Price is $1000");
        }else if(fruit.equals("Kiwi")){
            System.out.println("6");
        }else {
            System.out.println("This fruit is not available right now");
        }
        }
}
