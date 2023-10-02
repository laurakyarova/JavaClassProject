package class7;

public class E10Arrays {
    public static void main(String[] args) {

        //creating and initializing an array

        String [] fruit={"Apple","Orange","Banana","Kiwi","Pineapple",};
        System.out.println(fruit.length);//gives us the number of items in the array

        fruit[3]="Mango";

        for (int i = 0; i < fruit.length; i++) {
            System.out.println(fruit[i]);

        }



    }
}
