package class4;

import java.util.Scanner;

public class CreditCardHomeWork {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Do you have a credit card?");

        String creditCard=scanner.next();
        if(creditCard.equals("yes")){
            System.out.println("What is the balance on your card?");
            double cardBalance=scanner.nextDouble();
            if(cardBalance>1000){
                System.out.println("Please pay off your balance due");
            }else{
                System.out.println("Spent as much as you like, you are a baller!");
            }
        }else{
            System.out.println("Would you like to apply for a new credit card?");

        }
    }
}
