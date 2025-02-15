package begins;

import java.util.Scanner;

public class Begin15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Yuzasi S = ");
        double S = sc.nextDouble();
        final double pi = 3.14;
        double R = Math.sqrt(S/pi);
        double L = 2*pi*R;
        System.out.println("Radiusi = "+R+" Uzunligi = "+L);
    }
}
