package begins;

import java.util.Scanner;

public class Begin14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Uzunligi L = ");
        double L = sc.nextDouble();
        final double pi = 3.14;
        double R = L/(2*pi);
        double S = pi*R*R;
        System.out.println("Radiusi = "+R+" Yuzasi = "+S);
    }
}
