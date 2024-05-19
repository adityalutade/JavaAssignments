import java.util.Scanner;

public class W1A3Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: x = ");
        double x = sc.nextDouble();
        System.out.print("Enter 2nd number: y = ");
        double y = sc.nextDouble();

        double sum = x+y;

        System.out.print("Sum of two numbers is = "+sum);
        sc.close();
    }
}
