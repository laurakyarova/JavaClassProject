package class4;

public class Test {
    public static void main(String[] args) {

        boolean degree=true;
        double gpa=3.5;

        if(degree==true){
            System.out.println("Congratulations!");
            if(gpa>=3.5){
                System.out.println("You are eligible for scholarship");
            }else{
                System.out.println("You should have studied harder");
            }
        }else{
            System.out.println("You should get a degree!");
        }

    }
}
