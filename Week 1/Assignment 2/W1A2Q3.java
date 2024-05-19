import java.util.Scanner;

public class W1A2Q3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 1st number: x = ");
    int x = sc.nextInt();
    System.out.print("Enter 2nd number: y = ");
    int y = sc.nextInt();

    int temp = x;
    x=y;
    y=temp;

    System.out.println("Swapped numbers are :\nx = " + x + "\ny = "+y);

    sc.close();
    }
}
