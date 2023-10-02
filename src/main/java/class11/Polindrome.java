package class11;

public class Polindrome {
    public static void main(String[] args) {

        String str="level";
        String str2="";

        for (int i =str.length()-1; i >=0 ; i--) {
            str2=str2+str.charAt(i);
        }
        if(str.equals(str2)){
            System.out.println("This is a polindrome");
        }else{
            System.out.println("This is not a polindrome");
        }
    }
}
