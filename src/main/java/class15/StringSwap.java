package class15;

public class StringSwap {
    public static void main(String[] args) {

        String str1="Laura";
        String str2="Mora";
        str1=str1+str2;
        str2=str1.substring(0,str1.length()-str2.length());
        System.out.println(str2);
        str1=str1.substring(str2.length());
        System.out.println(str1);
    }
}
