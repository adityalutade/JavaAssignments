import java.util.Scanner;

public class W1A3Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value in minutes :");
        int in_min = sc.nextInt();

        int hours = in_min/60;
        int mins = in_min%60;
        
        System.out.println(in_min+" minutes is equal to "+hours+" hours and "+mins+" mins");
        sc.close();
    }
}
