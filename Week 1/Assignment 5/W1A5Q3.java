import java.util.Scanner;

public class W1A5Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = sc.nextInt();
        
       if (year%4==0)
       {
        if (year%100==0) {
            if (year%400==0) {
                System.out.println(year+" is a leap year");
            }
            else
            System.out.println(year+" is not a leap year");
        }
        else
        System.out.println(year+" is a leap year");
       }
        else
            System.out.println(year+" is not a leap year");
        sc.close();
}
}