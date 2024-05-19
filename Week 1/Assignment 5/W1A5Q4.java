import java.util.Scanner;

public class W1A5Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age of person to check eligibility : ");
        int age = sc.nextInt();
        
       if (age>=18)
            System.out.println("Person is eligible to vote");
        else
            System.out.println("Person is not eligible to vote");
        
        sc.close();
}
}