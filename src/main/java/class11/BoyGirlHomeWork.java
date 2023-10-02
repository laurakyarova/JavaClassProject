package class11;

import java.util.Scanner;

public class BoyGirlHomeWork {
    public static void main(String[] args) {
        /*Write a program that reads two people's first
names and if they are expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY*/

        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter Mothers name");
        String momName=scanner.nextLine();

        System.out.println("Please enter Fathers name");
        String dadName=scanner.nextLine();

        System.out.println("Please enter baby`s gender");
        String babygender=scanner.nextLine();

        if(babygender.equalsIgnoreCase("girl")){
            String girlName=momName.substring(0,momName.length()/2)+dadName.substring(0,dadName.length()/2);
            System.out.println(girlName);
        }else if(babygender.equalsIgnoreCase("boy")){
            String boyName=dadName.substring(0,dadName.length()/2)+momName.substring(0,momName.length()/2);
            System.out.println(boyName);
        }else{
            System.out.println("Invalid");
        }




        }

    }

