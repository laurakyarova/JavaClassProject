package class14;

public class ReverseStringMethod {

    public static void main(String[] args) {
        System.out.println(ReverseStringMethod.reverseStr("Hello"));

    }
      public static String reverseStr(String inputStr){
            String reversed=" ";
            for (int i =inputStr.length()-1; i >=0 ; i--) {
                reversed=reversed+inputStr.charAt(i);
            }
            return reversed;
    }


}
