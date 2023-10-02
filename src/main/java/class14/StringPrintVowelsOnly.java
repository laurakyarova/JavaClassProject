package class14;

public class StringPrintVowelsOnly {
    public static void main(String[] args) {
        System.out.println(getVowels("hello world"));
    }
    private static String getVowels(String str){
        return str.replaceAll("[^aeiouAEIOU]","");


    }
}
