import java.util.Scanner;

public class W1A5Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        
       if (num==0)
            System.out.println(num+" is neither POSITIVE nor NEGATIVE number");
        else
        {
            if (num>0)
                System.out.println(num+" is POSITIVE number");
            else
                System.out.println(num+" is NEGATIVE number");
        }
        sc.close();
}
}