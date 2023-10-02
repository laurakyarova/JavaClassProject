package class3;

public class E1TypeCasting {
    public static void main(String[] args) {

        //byte->short->int->long->float->double


        long age=12;
       // byte myAge=age;
        //this is an explicit casting-converting from a wide to narrower data type

        byte number=10;
        int number2=number;
        //this is an implicit casting-converting from a narrower to wider data type.

        float num1=15.6f;
        int num2;
        num2=(int)num1;
        // when converting will lose the 0.6, lose information

        System.out.println(num2);



    }
}
