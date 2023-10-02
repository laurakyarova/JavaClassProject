package class3;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your FullName");
        String fName=scanner.nextLine();
        System.out.println("Please Enter your City");
        String city= scanner.nextLine();
        System.out.println(fName+" "+city);
    }
}
