package class11;

public class E9StringMethods {
    public static void main(String[] args) {

        String str="Hi There how are you? I am Good. How are you. I am Driving";
       String [] strs= str.split(" ");
        System.out.println(strs.length);
        System.out.println(strs[10].trim());

    }
}
