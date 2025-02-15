package begins;

import java.util.Scanner;

public class Begin02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tomonini kiriting: ");
        double a = sc.nextDouble();
        double S = a*a;
        System.out.println("Area = "+S);
    }
}
