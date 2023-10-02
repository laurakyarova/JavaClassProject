package class11;

public class E7StringMethods {
    public static void main(String[] args) {

        String str="khHGG Hfgb24 737588 5!&54$#HGFFD_)*";
        System.out.println(str.replaceAll("[A-Z]","="));
        System.out.println(str.replaceAll("[A-C]","="));
        System.out.println(str.replaceAll("[a-z]","="));
        System.out.println(str.replaceAll("[0-9]","+"));
        System.out.println(str.replaceAll(" ",""));
        System.out.println(str.replaceAll("[A-z]",""));
        System.out.println(str.replaceAll("[&-;]",""));
        System.out.println(str.replaceAll("[A-Z0-9]",""));
        System.out.println(str.replaceAll("[A-Z0-58-9a-j]",""));
        System.out.println(str.replaceAll("[ks2S]",""));
        System.out.println(str.replaceAll("\\d",""));  //removes digits
        System.out.println(str.replaceAll("\\s","")); //removes spaces
        System.out.println(str.replaceAll("[^A-Za-z0-9]","")); //everything but

    }
}
