import java.util.Scanner;

public class W1A2Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        double a = sc.nextDouble();
        System.out.print("Enter 2nd number: ");
        double b = sc.nextDouble();

        double add = a+b;
        double sub = a-b;
        double mul = a*b;
        double div = a/b;

        System.out.println("Addition of two numbers is = "+ add);
        System.out.println("Substraction of two numbers is = "+ sub);
        System.out.println("Multiplication of two numbers is = "+ mul);
        System.out.println("Division of two numbers is = "+ div);
        
        sc.close();
    }
}
