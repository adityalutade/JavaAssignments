import java.util.Scanner;

public class W1A3Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit :");
        double tempinF = sc.nextDouble();

        double tempinC = (5.0/9.0)*(tempinF-32.0);
        
        System.out.println("Temperature in Celsius is : "+tempinC);
        sc.close();
}
}