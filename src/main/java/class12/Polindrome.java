package class12;

public class Polindrome {

    String poling(String word){
        String str="level";
        String str2="";

        for (int i =str.length()-1; i >=0 ; i--) {
            str2=str2+str.charAt(i);
        }
        if(str.equals(str2)){
            return "This is a polindrome";
        }else{
            return "This is not a polindrome";
    }
}}
