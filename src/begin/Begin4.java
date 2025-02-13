package begin;

import java.util.Scanner;

public class Begin4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Diametr: ");
        double d = sc.nextDouble();
        final double pi = 3.14;
        double L = d*pi ;
        System.out.println("Uzunligi = "+L);
    }
}
