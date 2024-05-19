import java.util.Scanner;

public class W1A3Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of sphere:");
        double radius = sc.nextDouble();

        double volumne = (4.0/3.0) * Math.PI * (radius*radius*radius);
        
        System.out.println("Volume of sphere with radius "+radius+" cm is : "+volumne+" cubic cm");
        sc.close();
    }
}
