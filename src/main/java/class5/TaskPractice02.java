package class5;

import java.util.Scanner;

public class TaskPractice02 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Please ender a number");
        int number=scanner.nextInt();
        if(number>=1 && number<=10){
            System.out.println("It`s a small number");
        }else if(number>=11&& number<=100){
            System.out.println("It`s a medium number");
        }else if(number>=101&&number<=1000){
            System.out.println("It`s a large number");
        }else{
            System.out.println("Invalid number");
        }


        }

    }

