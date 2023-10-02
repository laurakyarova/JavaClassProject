package class6review;

import java.util.Scanner;

public class E3Switch {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the name of the fruit");
        String fruit=scanner.nextLine();

        switch(fruit){
            case "Orange":
                System.out.println("It is usually orange");
                break;
            case "Banana":
                System.out.println("It is usually yellow");
            break;
            case "Blueberry":
                System.out.println("Good for you");
                break;
            default:
                System.out.println("I don`t know that fruit");
        }
    }
}
