package begin;

import java.util.Scanner;

public class Begin5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tomoni: ");
        double a = sc.nextDouble();
        double sirti = 6*a*a;
        double hajmi = a*a*a;
        System.out.println("To'la sirti = " + sirti);
        System.out.println("Hajmi = " + hajmi);
    }
}
