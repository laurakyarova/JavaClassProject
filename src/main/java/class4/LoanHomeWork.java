package class4;

import java.util.Scanner;

public class LoanHomeWork {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter loan amount needed");
        double loan=scanner.nextDouble();
        if(loan<=200000) {
            System.out.println("You`ve been approved for the loan! ");
        }else{
            System.out.println("You`ve been denied for the loan");
        }
    }
}
