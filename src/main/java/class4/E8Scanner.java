package class4;

import java.util.Scanner;

public class E8Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your Name");
        String name=scanner.next();
        if(name.equals("Laura")){
            System.out.println("The amazing");
        }else if(name.equals("Ellie")){
            System.out.println("Best BabyGirl");
        }else if(name.equals("Victor")){
            System.out.println("Best Chef");
        }else if(name.equals("Andrek")){
            System.out.println("Loves his tablet");
        }
    }
}
