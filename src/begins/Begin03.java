package begins;

import java.util.Scanner;

public class Begin03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tomonlarini kiriting: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double yuzasi = a*b;
        double perimetri = 2*(a+b);
        System.out.println("Yuzasi = " + yuzasi);
        System.out.println("Perimetri = " + perimetri);
    }
}
