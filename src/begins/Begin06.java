package begins;

import java.util.Scanner;

public class Begin06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tomonlari: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double sirti = 2*(a*b+b*c+a*c);
        double hajmi = a*b*c;
        System.out.println("To'la sirti = " + sirti);
        System.out.println("Hajmi = " + hajmi);
    }
}
