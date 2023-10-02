package class5;

import java.util.Scanner;

public class PracticeTest03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter your country");

        String country=scanner.nextLine();
        country=country.toLowerCase();

        switch(country){
            case "usa":
                System.out.println("english");
                break;
            case "spain":
                System.out.println("spanish");
                break;
            case "france":
                System.out.println("french");
                break;
            default:
                System.out.println("country not supported");
        }
    }
}
