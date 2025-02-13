package begin;

import java.util.Scanner;

public class Begin7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius: ");
        double radius = sc.nextDouble();
        final double pi = 3.14;
        double uzunligi = 2*pi*radius;
        double yuzasi = pi*radius*radius;
        System.out.println("Uzunligi: "+uzunligi+" Yuzasi "+yuzasi);

    }
}
