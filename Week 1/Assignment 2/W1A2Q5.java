import java.util.Scanner;

public class W1A2Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle:");
        double radius = sc.nextDouble();

        double area = Math.PI*(radius*radius);
        
        System.out.println("Area of circle with radius "+radius+" cm is : "+area+" sq cm");
        sc.close();
    }
}