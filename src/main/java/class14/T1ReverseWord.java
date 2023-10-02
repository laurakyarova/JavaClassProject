package class14;

public class T1ReverseWord {
    public static void main(String[] args) {
       // StringBuilder str=new StringBuilder("This is sentence I want to reverse");
      //  str.reverse();
       // System.out.println(str);

        String str="This is sentence I want to reverse";
        String [] arr=str.split(" ");

        for (int i = 0; i <arr.length; i++) {
            String word=arr[i];
            String reversed=reverseStr(word);
            System.out.print(reversed+" ");

        }
    }
    static String reverseStr(String inputStr){
        String reversed=" ";
        for (int i =inputStr.length()-1; i >=0 ; i--) {
            reversed=reversed+inputStr.charAt(i);
        }
        return reversed;
    }

}
