import java.util.Scanner;

public class W1A4Q2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter 1st time:");
         System.out.print("Hours = ");
         int hrs1 = sc.nextInt();
         System.out.print("Minutes = ");
         int mins1 = sc.nextInt();
         System.out.println("Enter 2nd time:");
         System.out.print("Hours = ");
         int hrs2 = sc.nextInt();
         System.out.print("Minutes = ");
         int mins2 = sc.nextInt();

         int sum_hrs = hrs1 + hrs2;
         int sum_mins = mins1 + mins2;
         int total_mins = (60*sum_hrs) + sum_mins;

         int hrs = total_mins/60;
         int mins = total_mins%60;

         System.out.println("Sum of two entered time is "+hrs+" hours and "+mins+" minutes");
         
         sc.close();
    }
}
