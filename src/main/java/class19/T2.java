package class19;

public class T2 {

    public static void num(int num1,int num2){
        System.out.println(num1+num2);

    }
    public static void num(int num1, int num2, int num3){
        System.out.println(num1+num2+num3);

    }

    public static void main(String[] args) {
        T2.num(10,5);
        num(12,2,5);
    }
}
