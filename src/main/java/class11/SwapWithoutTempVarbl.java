package class11;

public class SwapWithoutTempVarbl {
    public static void main(String[] args) {
        //How would you swap  2 strings without a temporary variable?

        String a="hello";
        String b="bye";
        System.out.println("Before swap a="+a+" b="+b);
        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());

        System.out.println("After swap a=" +a+" b="+b);
    }
}
