package class12;

public class E2MethodsTester {
    public static void main(String[] args) {

        E2Methods e2=new E2Methods();
        int result=e2.add(10,10);
        System.out.println(result);

        int results= e2.multiply(20);
        System.out.println(results);

        int largest=e2.largestNum(12,34);
        System.out.println(largest);

    }
}
