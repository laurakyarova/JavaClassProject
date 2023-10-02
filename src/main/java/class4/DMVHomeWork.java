package class4;

import java.util.Scanner;

public class DMVHomeWork {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter your age");
        int age=scanner.nextInt();
        if(age>=18){
            System.out.println("Driver license issued");
        }else{
            System.out.println("Get learner`s permit");
        }
    }
}
