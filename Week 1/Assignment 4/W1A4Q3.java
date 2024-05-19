import java.util.Scanner;

public class W1A4Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = sc.nextInt();

        if(num1==num2)
        System.out.println("Both numbers are equal");
        else
        System.out.println("Both numbers are different");

        sc.close();
    }
}
