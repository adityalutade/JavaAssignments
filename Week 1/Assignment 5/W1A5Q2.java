import java.util.Scanner;

public class W1A5Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        
       if (num%2==0)
            System.out.println(num+" is an EVEN number");
        else
            System.out.println(num+" is an ODD number");
        
        sc.close();
}
}