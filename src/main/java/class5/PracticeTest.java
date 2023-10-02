package class5;

/* Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in March, April, May → season =”Spring”
if user is born in June, July, August →
season =”Summer”  etc …
At the end of the program we should see 1 output as “You were born is season __”.

 */

import java.util.Scanner;

public class PracticeTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter your birth month");
        String month=scanner.next();

         if(       month.equalsIgnoreCase("March")
                 ||month.equalsIgnoreCase("April")
                 ||month.equalsIgnoreCase("May")){
                   System.out.println("Spring");
         }else if( month.equalsIgnoreCase("June")
                 ||month.equalsIgnoreCase("July")
                 ||month.equalsIgnoreCase("August")){
                   System.out.println("Summer");
         }else if(month.equalsIgnoreCase("September")
                 ||month.equalsIgnoreCase("October")
                 ||month.equalsIgnoreCase("November")){
                   System.out.println("Fall");
         }else {
                   System.out.println("Winter");
         }
    }
}
