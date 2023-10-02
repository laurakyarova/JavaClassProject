package class4;

import java.util.Scanner;

public class SalaryHomeWork {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many years have you worked at your job?");
        double years=scanner.nextDouble();
        if(years>=5){
            System.out.println("You are eligible for a bonus, you hard worker!");

            System.out.println("What is your annual salary?");
            double salary=scanner.nextDouble();
            if(salary>50000){
                System.out.println("Your bonus is $5000");
            }else{
                System.out.println("Your bonus is $3000");
            }
        }else{
            System.out.println("Sorry buddy, no bonus for you!");
        }


    }
}
