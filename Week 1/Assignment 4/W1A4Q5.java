import java.util.Scanner;

public class W1A4Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = sc.nextInt();

        if(num1>num2)
        System.out.println("1st number is greater");
        else if(num1<num2)
        System.out.println("2nd number is greater");
        else
        System.out.println("Both numbers are same");

        sc.close();
    }
}
