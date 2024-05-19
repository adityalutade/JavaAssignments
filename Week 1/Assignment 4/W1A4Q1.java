import java.util.Scanner;

public class W1A4Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Days :");
        int in_days = sc.nextInt();

        int years = in_days/365;
        int rem_days = in_days%365;
        int months = rem_days/30;
        int days = rem_days%30;
        
        System.out.println(in_days+" Days is equal to "+years+" Years, "+months+" Months and "+days+" Days");
        sc.close();
    }
}
