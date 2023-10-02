package class11;

public class TaskOddStringMiddleCharachter {
    public static void main(String[] args) {

       String str="Shoes";
        if(str.length()%2!=0&&str.length()>=3){
            int middle=str.length()/2;
            System.out.println(str.charAt(middle));

        }

        }

    }

