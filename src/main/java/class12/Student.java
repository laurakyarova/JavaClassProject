package class12;

public class Student {
    String grade(int score){
        if(score>=90){
            return "A";
        }else if(score>=80){
            return "B";
        }else if(score>=70){
            return "C";
        }else if(score>=50){
            return "D";
        }else{
            return "F";
        }

    }
}
