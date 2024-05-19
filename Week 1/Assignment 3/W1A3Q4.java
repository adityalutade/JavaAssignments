import java.util.Scanner;

public class W1A3Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value in centimeter :");
        int in_cms = sc.nextInt();

        int meter = in_cms/100;
        int cms = in_cms%100;
        
        System.out.println(in_cms+" cms is equal to "+meter+" meter and "+cms+" cm");
        sc.close();
}
}