/*: Write a program that takes two dates as input from the user 
(e.g., using Scanner) and calculates the difference between them in days. */

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDifference{
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter the 1st Date: ");
        String date1 = userinput.next();

       System.out.println("Enter the 2nd Date: ");
       String date2 = userinput.next();

       SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

       Date date1 = dateFormat.parse(dateString1);
       Date date2 = dateFormat.parse(dateString2);

       char result =  Math.abs(date1 - date2);
       System.out.println("Difference between the two dates: " + result + " days");
        

}
}