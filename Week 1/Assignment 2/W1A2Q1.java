import java.util.Scanner;

public class W1A2Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

        int add = a+b;
        System.out.println("Addition of two numbers is = "+ add);
        
        sc.close();
    }
}
